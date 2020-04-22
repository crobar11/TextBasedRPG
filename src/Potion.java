
import java.util.ArrayList;

public class Potion extends Item
{
    private String name;
    private int heal, strength, speed;
    private ArrayList potions;
    
    public Potion(String n, int h, int st)
    {
        name = n;
        heal = h;
        strength = st;
        
    }
    
    public String getValue()
    {
        return name;
    }
    
    public void use()
    {
        
    }
    
    public int getStrength()
    {
        return strength;
    }
    
    public int getHeal()
    {
        return heal;
    }
    
    public int getSpeed()
    {
        return speed;
    }
}
