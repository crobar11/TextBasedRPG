/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alecw
 */
import java.util.ArrayList;
import java.lang.Math;
public class Encounter {
    
    private ArrayList<String> MonsterList;
    private ArrayList<String> SettingList;
    
    public Encounter()
    {
        MonsterList = new ArrayList();
        MonsterList.add("Ogre");
        MonsterList.add("Bat");
        MonsterList.add("Vampire");
        MonsterList.add("Werewolf");
        MonsterList.add("Zombie");
        MonsterList.add("Bear");
        MonsterList.add("Giant Bug");
        MonsterList.add("Giant");
        MonsterList.add("Bandit");
        MonsterList.add("Venus Fly Trap");
        MonsterList.add("Slime");
        MonsterList.add("Skeleton");
        MonsterList.add("Giant Eyeball");
        MonsterList.add("Witch");
        MonsterList.add("Troll");
        
        SettingList = new ArrayList();
        SettingList.add("Desert");
        SettingList.add("Forest");
        SettingList.add("Abandoned Mineshaft");
        
    }
    
    public String RandomMonster()
    {
        int random; 
        random = (int)(Math.random()*15);
        return MonsterList.get(random);
    }
    
    public String Setting()
    {
        
    }
    
    public 
    
    
    
}
