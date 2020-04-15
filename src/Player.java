
import java.util.ArrayList;

public class Player
{
    int currentHealth;
    int maxHealth;
    int speed;
    int strength;
    ArrayList<Item> inventory;
    
    
    public Player()
    {
        maxHealth = 5;
        currentHealth = 5;
        speed = 1;
        strength = 1;
        inventory = new ArrayList<Item>();
    }
    
    public int addItem(Item i)//0 means duplicate, 1 means successful
    {
        if(inventory.contains(i))
            return 0;
        else
        {
            inventory.add(i);
            return 1;
        }
    }
    
    public boolean isInventoryEmpty()
    {
        return inventory.isEmpty();
    }
    
    public void setHealth(int h)
    {
        currentHealth = h;
    }
    
    public int decrementHealth() //0 means player is dead, 1 means they successfully lost health
    {
        if(currentHealth == 1)
        {
            currentHealth--;
            return 0;
        }
        else
        {
            currentHealth--;
            return 1;
        }
    }
    
    public int incrementHealth() //0 means player is at max health, 1 means they successfully gained health
    {
        if(currentHealth == maxHealth)
        {
            return 0;
        }
        else
        {
            currentHealth++;
            return 1;
        }
    }
    
    public int getCurrentHealth()
    {
        return currentHealth;
    }
    
    public int getMaxHealth()
    {
        return maxHealth;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int getStrength()
    {
        return strength;
    }
    
    public void setSpeed(int s)
    {
        speed = s;
    }
    
    public void setStrength(int s)
    {
        strength = s;
    }
    
    public String toString()
    {
        return "You have " + currentHealth + " out of " + maxHealth + " hearts";
    }
}