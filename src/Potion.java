
import java.util.ArrayList;

public class Potion implements Item
{
    private String name;
    private int heal, strength, speed;
    private ArrayList potions;
    
    public Potion(String n, int h, int s, int sp)
    {
        name = n;
        heal = h;
        strength = s;
        speed = s;
        
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
    
    public String getName()
    {
        return name;
    }
}
