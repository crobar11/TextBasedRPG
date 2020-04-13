public class Weapon implements Item
{
    private String name;
    private int strength;
    
    public Weapon(String n, int s)
    {
        name = n;
        strength = s;
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
}
