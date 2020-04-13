public class Potion implements Item
{
    public String name;
    public int heal;
    
    public Potion(String n, int h)
    {
        name = n;
        heal = h;
    }
    
    public void use()
    {
        //heal character
    }
    
    public int getHeal()
    {
        return heal;
    }
    
    public String getName()
    {
        return name;
    }
}
