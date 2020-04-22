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

public class ItemMap<K,Item> {
    
    private ArrayList<Item> list;
    private int size; 
    
    public ItemMap()
    {
        list = new ArrayList();
     //   Weapon sword = new Weapon("Sword",2);
        list.add( (Item)new Weapon("Sword",2,90)    );
        list.add( (Item)new Weapon("Axe",4,60)      );
        list.add( (Item)new Weapon("Spear",3,80 )   );
        list.add( (Item)new Weapon("Crossbow",7,70) );
        list.add( (Item)new Weapon("Whip",1,100)     );
        list.add( (Item)new Weapon("Mace",3,60)     );
        list.add( (Item)new Weapon("Katana",6,60)                );
        list.add( (Item)new Weapon("Baton",1,100));
        list.add( (Item)new Weapon("Halberd",5,70)      );
        list.add( (Item)new Weapon("Sai",4,70));
        
                
    }
    
    public Item get(K key)
    {
        
       Item item =(Item)(list.get((int)key));
       if(list.get((int)key).getValue().equals("Weapon"))
           list.remove((int)key);
       
       return item;
        
    }
    
    public Item remove(K key)
    {
        Item removed = list.get((int)key);
        list.remove((int)key);
        size--;
        return removed;
    }
    
    public int size()
    {
        return size;
    }
    
    
    
}
