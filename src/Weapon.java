public class Weapon extends Item
{
    private String name;
    private int strength, accuracy;
    
    public Weapon(String n, int s, int a)
    {
        name = n;
        strength = s;
        accuracy = a;
        
    }
    
    public void use()
    {
        //attack
    }
    
    public int getStrength()
    {
        return strength;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAccuracy()
    {
        return accuracy;
    }
    
    public String getValue()
    {
        return "weapon";
    }
}
