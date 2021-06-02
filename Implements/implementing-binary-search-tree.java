Binary Search Tree in Java
      BST is a binary tree 
      in which the key in each node is greater than or equal to any key stored in the left sub-tree, 
      and less than or equal to any key stored in the right sub-tree.
      
      We can use recursion to implement the search operation:
class BST {
 
    class Node {
        int data;
        Node left, right;
 
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;
    BST() { 
        root = null; 
    }
    
    Node search(Node root, int data) {
        if(root == null) {
            System.out.print("Not found\n");
            return null;
        }
        if(root.data == data) {
            System.out.print("Found at: " + root + "\n");
            return root;
        }
        if(root.data < data)
            return search(root.right, data);
        else
            return search(root.left, data);
    }

    void insert(int data) {
        root = recInsert(root, data);
    }
     
    Node recInsert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if(data <= root.data)
            root.left = recInsert(root.left, data);
        else
            root.right = recInsert(root.right, data);

        return root;
    }

    public static void main(String[] args) {
        BST t = new BST();

        t.insert(5);
        t.insert(3);
        t.insert(8);
        t.insert(1);
        t.insert(4);
        t.insert(7);
        t.insert(9);
        t.insert(0);
        t.insert(2);
        t.insert(6);
        t.insert(10);

        t.search(t.root, 10);
    }
}
      //output: BST$Node@38af3868
      The output is Node Object representation. 
      You can change the output by overriding the toString() method of the Node Class.
      
      Another implementation:
      It allows you to insert, search, and delete, along with several other options.  
      The key point is to show you the traversal output: preorder, inorder, and postorder.

      
      You have to read the options menu before hand and 
      enter your inputs on separate lines.
      If you dont want to play with the menu options, then
      copy and paste this into the input after running to
      see a random tree (the number is the tree size):
 
ir
15
n
h
pre
in
post
x
 
      If the tree size is less than expected, that's 
      because this implementation rejects duplicate entries.
import java.util.Scanner;
import java.util.Random;

public class BinaryNode<Entry extends Comparable<Entry>>
{
    Entry data;
    BinaryNode<Entry> left, right;
    
    public BinaryNode(Entry data)
    {
        left = null;
        right = null;
        this.data = data;
    }
}

public abstract class BinaryTree<Entry extends Comparable<Entry>>
{
    protected BinaryNode<Entry> root;
    
    public BinaryTree()
    {
        root = null;
    }
    
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public int size()
    {
        return size(root);
    }
    
    public int height()
    {
        return height(root);
    }
    
    public void clear()
    {
        clear(root);
        root = null;
    }
    
    public void preorder()
    {
        preorder(root);
    }
    
    public void inorder()
    {
        inorder(root);
    }
    
    public void postorder()
    {
        postorder(root);
    }
    
    //Recursive helper methods
    private void preorder(BinaryNode<Entry> subroot)
    {
        if(subroot != null)
        {
            System.out.print(subroot.data + " ");
            preorder(subroot.left);
            preorder(subroot.right);
        }
    }
    
    private void inorder(BinaryNode<Entry> subroot)
    {
        if(subroot != null)
        {
            inorder(subroot.left);
            System.out.print(subroot.data + " ");
            inorder(subroot.right);
        }
    }
    
    private void postorder(BinaryNode<Entry> subroot)
    {
        if(subroot != null)
        {
            postorder(subroot.left);
            postorder(subroot.right);
            System.out.print(subroot.data + " ");
        }
    }
    
    private int size(BinaryNode<Entry> subroot)
    {
        if(subroot == null)
        {
            return 0;
        }
        else
        {
            return 1 + size(subroot.left) + size(subroot.right);
        }
    }
    
    private int height(BinaryNode<Entry> subroot)
    {
        if(subroot == null)
        {
            return 0;
        }
        else
        {
            int leftSubtreeHeight = height(subroot.left);
            int rightSubtreeHeight = height(subroot.right);
            
            if(leftSubtreeHeight >= rightSubtreeHeight)
                return 1 + leftSubtreeHeight;
            else
                return 1 + rightSubtreeHeight;
            
        }
    }
    
    private void clear(BinaryNode<Entry> subroot)
    {
        if(subroot != null)
        {
            clear(subroot.left);
            clear(subroot.right);
            subroot = null;
        }
    }
}

@SuppressWarnings("unchecked")
public class BinarySearchTree<Entry extends Comparable<Entry>> extends BinaryTree
{
    BinarySearchTree()
    {
        super();
    }
    
    public boolean search(Entry target)
    {
        BinaryNode<Entry> found = search(root, target);
        return found != null;
    }
    
    public boolean insert(Entry newData)
    {
        root = insert(root, newData);
        return root != null;
    }
    
    public boolean remove(Entry target)
    {
        root = remove(root, target);
        return root != null;
    }
    
    //Recursive helper methods
    private BinaryNode<Entry> search(BinaryNode<Entry> subroot, Entry target)
    {
        if(subroot == null || target.compareTo(subroot.data) == 0)
            return subroot;
        else if(target.compareTo(subroot.data) < 0)
            return search(subroot.left, target);
        else if(target.compareTo(subroot.data) > 0)
            return search(subroot.right, target);
        else
            return null;
    }
    
    private BinaryNode<Entry> insert(BinaryNode<Entry> subroot, Entry newData)
    {
        if(subroot == null)
        {
            subroot = new BinaryNode(newData);
        }
        else if(newData.compareTo(subroot.data)  < 0)
        {
            subroot.left = insert(subroot.left, newData);
        }
        else if(newData.compareTo(subroot.data)  > 0)
        {
            subroot.right = insert(subroot.right, newData);
        }
        
        return subroot;
    }
    
    private BinaryNode<Entry> remove(BinaryNode<Entry> subroot, Entry target)
    {
        if(subroot == null)
            return subroot;
        else if(target.compareTo(subroot.data) == 0)
        {
            if(subroot.left == null)
                return subroot.right;
            else if(subroot.right == null)
                return subroot.left;
            else
            {
                BinaryNode<Entry> immediatePredecessor = subroot.left;
                while(immediatePredecessor.right != null)
                {
                    immediatePredecessor = immediatePredecessor.right;
                }
                
                subroot.data = immediatePredecessor.data;
                //remove redundant predecessor node
                subroot.left = remove(subroot.left, subroot.data);
            }
        }
        else if(target.compareTo(subroot.data) < 0)
        {
            subroot.left = remove(subroot.left, target);
        }
        else
        {
            subroot.right = remove(subroot.right, target);
        }
        return subroot;
    }
    
}

public class Main 
{
    private static void displayMenu()
    {
        System.out.println("**|Binary Search Tree Menu|**\n\t"
                + "i: Manually Insert Entries\n\t"
                + "ir: Insert Random Entries\n\t"
                + "s: Search Entries\n\t"
                + "r: Remove Entries\n\t"
                + "pre: Print Preorder Traversal\n\t"
                + "in: Print Inorder Traversal\n\t"
                + "post: Print Postorder Traversal\n\t"
                + "n: Print Tree Size\n\t"
                + "h: Print Tree Height\n\t"
                + "c: Clear All Entries\n\t"
                + "x: Exit\n**************");
    }
    
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> bst = new BinarySearchTree();
        Scanner reader = new Scanner(System.in);
        String input;
        int key;
        boolean exit = false;
        
        displayMenu();  //better for sololearn
        while(!exit)
        {
            //displayMenu(); //place here for console applications
            try
            {
                input = reader.nextLine();
                input = input.toLowerCase();
            }
            catch(Exception ex)
            {
                input = "x";
            }
            
            switch(input)
            {
                case "i":    //Insert
                    System.out.println("(Enter 'q' to quit inserting keys) Enter keys to insert: ");
                    
                    boolean quit = false;
                    while(!quit)
                    {
                        String insertInput = reader.nextLine();
                        insertInput = insertInput.toLowerCase();
                        if(!insertInput.equals("q"))
                        {
                            try
                            {
                                key = Integer.parseInt(insertInput);
                                bst.insert(key);
                            }
                            catch(java.lang.NumberFormatException ex)
                            {
                                System.out.println(ex);
                                System.out.println("Invalid Input: Please enter an integer or 'q' to quit.\n");
                            }
                        }
                        else
                            quit = true;
                    }
                    break;
                case "ir":  //Insert Random Entries
                    System.out.println("Enter a tree size (number of entries): ");
                    try
                    {
                        int n = reader.nextInt();
                        Random randomEntry = new Random();
                        
                        for(int i = 0; i < n; i++)
                        {
                            bst.insert(randomEntry.nextInt(100) + 1);
                        }
                    }
                    catch(java.util.InputMismatchException ex)
                    {
                        System.out.println(ex);
                        System.out.println("Invalid Input: Please enter an integer.\n");
                    }
                    break;
                case "s":    //Search
                    System.out.println("Enter a key to search: ");
                    try
                    {
                        key = reader.nextInt();
                        if(bst.search(key))
                            System.out.println("Search successful: Entry exists in tree.\n");
                        else
                            System.out.println("Search failed: Entry not found.\n");
                    }
                    catch(java.util.InputMismatchException ex)
                    {
                        System.out.println(ex);
                        System.out.println("Invalid Input: Please enter an integer.\n");
                    }
                    break;
                case "r":    //Remove
                    System.out.println("Enter a key to remove: ");
                    try
                    {
                        key = reader.nextInt();
                        if(bst.remove(key))
                            System.out.println("Removal successful: Entry removed from tree.\n");
                        else
                            System.out.println("Removal failed: Entry not found.\n");
                    }
                    catch(java.util.InputMismatchException ex)
                    {
                        System.out.println(ex);
                        System.out.println("Invalid Input: Please enter an integer.\n");
                    }
                    break;
                case "pre":
                    System.out.println("\n\nPreorder: ");
                    bst.preorder();
                    System.out.println("\n\n");
                    break;
                case "in":
                    System.out.println("\nInorder: ");
                    bst.inorder();
                    System.out.println("\n\n");
                    break;
                case "post":
                    System.out.println("\nPostorder: ");
                    bst.postorder();
                    System.out.println("\n\n");
                    break;
                case "n":   //Tree size
                    System.out.println("Tree size: " + bst.size());
                    break;
                case "h":   //Tree height
                    System.out.println("Tree height: " + bst.height());
                    break;
                case "c":   //Clear All Entries
                    bst.clear();
                    System.out.println("The tree is now empty.");
                    break;
                case "x":    //Exit
                    exit = true;
                    break;
            }
        }
    }
}


