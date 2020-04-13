
import java.util.ArrayList;

public class BinaryTree 
{
    private final static class Node
    {
    Node parent;
    Node leftChild;
    Node rightChild;
    int element;
    
    public Node(int elem)
    {
        parent =  null;
        leftChild = null;
        rightChild = null;
        this.element = elem;
    }
    public Node(Node parent)
    {
        this.parent = parent;
    }
    
    public void setParent(Node node)
    {
        this.parent = node;
    }
    
    public void setLeftChild(Node node)
    {
        this.leftChild = node;
    }
    
    public void setRightChild(Node node)
    {
        this.rightChild = node;
    }
    
    public void setElement(int elem)
    {
        this.element = elem;
    }
    
    public Node getParent()
    {
        return this.parent;
    }
    
    public int getElement()
    {
        return this.element;
    }
    
    public Node getLeftChild()
    {
        return leftChild;
    }
    
    public Node getRightChild()
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
    
    private Node root;
    private int size;
    public BinaryTree()
    {
        root = null;
    }
    public void addLeft( int element, Node n )
    {
        Node noob = new Node(element);
        n.setLeftChild(noob);
        noob.setParent(n);
    }
    public void addRight(int element, Node n)
    {
        Node noob = new Node(element);
        noob.setParent(n);
        n.setRightChild(noob);
    }
    
    public int depth(Node e)
    {
        if(e.getParent() != null)
        return 1 + depth(e.getParent());
        else
        return 0;
    }
    
    public boolean isInternal(Node node)
    {
        if(node.isExternal() == false)
        return true;
        return false;
    }
    
    public boolean isExternal(Node node)
    {
        return node.isExternal();
    }
    
    public int size()
    {return size;}
    
    public boolean isRoot(Node node)
    {
        if(node.getParent() == null)
        return true;
        return false;
    }
    public int getElement(Node node)
    {return node.getElement();}
    
    public Node parent(Node node)
    {return node.getParent();}
    
    public Node root()
    {return root;}
}
