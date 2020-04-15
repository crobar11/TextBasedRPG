public class Monster 
{
    private String name;
    private int power;
    private int evasion;
    
    public Monster(String n, int p, int e)
    {
        name = n;
        power = p;
        evasion = e;
        //evastion is chance of dodging an attack
    }
    
    public int attack()
    {
        return power;
    }
    
    public int speed()
    {
        return evasion;
    }
    
    public String getName()
    {
        return name;
    }
}
