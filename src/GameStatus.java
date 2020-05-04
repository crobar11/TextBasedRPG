
import java.util.ArrayList;
import java.util.Scanner;

public class GameStatus
{
    BinaryTree gameStatus = new BinaryTree();
    ItemMap items = new ItemMap();
    Player character = new Player();
    
    public void execute(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Adventurer, To TextQuest! \n Would You Like To Begin Your Quest? \n Type: \"Yes\" to continue");
        String name = sc.nextLine();
        if(name.equals("Yes") || name.equals("yes"))
        {
            for(int x = 0; x < 7; x++)
            {
                encounterThing();
            }
            System.out.println("Congratulations! You have beaten TextQuest! You gather the treasure you have found and retire.");
        }
        
        
        
    }
    
    public void encounterThing()
    {
        Scanner sc = new Scanner(System.in);
        
        Encounter random = new Encounter();
        gameStatus.addLeft(random, gameStatus.root());
        System.out.println(random.flavorText());
        if(random.isMonster() == true)
        {
            System.out.println("Would you like to initiate combat? Or flee? Type \"Fight \"to fight, and \"Flee\" to flee.");
            String temp = sc.nextLine();
            if(temp.equals("Fight"))
                {
                    combat(random);
                }
            
            else if(temp.equals("Flee"))
            {
                int egg = (int)(Math.random()*10);
                if(egg >=5)
                {
                    System.out.println("You manage to escape the monster, and continue your quest");
                    return;
                }
                else
                {
                    System.out.println("You attempt to escape, but the monster catches up and initiates combat");
                    combat(random);
                }
            }
        }
        
        else if(random.isMonster() == false)
        {
            System.out.println("You do not encounter anything in this area, and continue on your quest");
            return;
        }
    }
    
        
    public void combat(Encounter e)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("You are fighting a " + e.getMonsterName() + ", it has " + e.monsterStats().health() + "health" + "");
    }
}

