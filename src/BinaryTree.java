
import java.util.ArrayList;

public class BinaryTree 
{
    private final static class Encounter
    {
    Encounter parent;
    Encounter leftChild;
    Encounter rightChild;
    int element;
    
    public Encounter(int elem)
    {
        parent =  null;
        leftChild = null;
        rightChild = null;
        this.element = elem;
    }
    public Encounter(Encounter parent)
    {
        this.parent = parent;
    }
    
    public void setParent(Encounter e)
    {
        this.parent = e;
    }
    
    public void setLeftChild(Encounter e)
    {
        this.leftChild = e;
    }
    
    public void setRightChild(Encounter e)
    {
        this.rightChild = e;
    }
    
    public void setElement(int elem)
    {
        this.element = elem;
    }
    
    public Encounter getParent()
    {
        return this.parent;
    }
    
    public int getElement()
    {
        return this.element;
    }
    
    public Encounter getLeftChild()
    {
        return leftChild;
    }
    
    public Encounter getRightChild()
    {
        return rightChild;
    }
    
    public boolean isExternal()
    {   
        if(getLeftChild() == null && getRightChild() == null)
            return true;
        return false;
    }
    }
    
    private Encounter root;
    private int size;
    public BinaryTree()
    {
        root = null;
    }
    public void addLeft( int element, Encounter n )
    {
        Encounter noob = new Encounter(element);
        n.setLeftChild(noob);
        noob.setParent(n);
    }
    public void addRight(int element, Encounter n)
    {
        Encounter noob = new Encounter(element);
        noob.setParent(n);
        n.setRightChild(noob);
    }
    
    public int depth(Encounter e)
    {
        if(e.getParent() != null)
        return 1 + depth(e.getParent());
        else
        return 0;
    }
    
    public boolean isInternal(Encounter e)
    {
        if(e.isExternal() == false)
        return true;
        return false;
    }
    
    public boolean isExternal(Encounter e)
    {
        return e.isExternal();
    }
    
    public int size()
    {return size;}
    
    public boolean isRoot(Encounter e)
    {
        if(e.getParent() == null)
        return true;
        return false;
    }
    public int getElement(Encounter e)
    {return e.getElement();}
    
    public Encounter parent(Encounter e)
    {return e.getParent();}
    
    public Encounter root()
    {return root;}
}
