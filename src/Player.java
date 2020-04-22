
import java.util.ArrayList;

public class Player
{
    int currentHealth;
    int maxHealth;
    int strength;
    ArrayList<Item> inventory;
    
    
    public Player()
    {
        maxHealth = 5;
        currentHealth = maxHealth;
        strength = 1;
        inventory = new ArrayList<Item>();
    }
    
    public void addItem(Item i)
    {
        inventory.add(i);
    }
    
    public boolean isInventoryEmpty()
    {
        return inventory.isEmpty();
    }
    
    public void setHealth(int h)
    {
        currentHealth = h;
    }
    
    public void decrementHealth(int x)
    {
        currentHealth-=x;
    }
    
    public void incrementHealth(int x)
    {
        currentHealth+=x;
    }
    
    public int getCurrentHealth()
    {
        return currentHealth;
    }
    
    public int getMaxHealth()
    {
        return maxHealth;
    }
    
    public int getStrength()
    {
        return strength;
    }
   
    public void setStrength(int s)
    {
        strength = s;
    }
    
    public void increaseStrength(int s)
    {
        strength+=s;
    }
    
    public String toString()
    {
        return "You have " + currentHealth + " out of " + maxHealth + " hearts";
    }
}