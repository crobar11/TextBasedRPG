public class Player
{
    int currentHealth;
    int maxHealth;
    
    
    public Player()
    {
        maxHealth = 5;
        currentHealth = 5;
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
    
    public String toString()
    {
        return "You have " + currentHealth + " out of " + maxHealth + " hearts";
    }
}