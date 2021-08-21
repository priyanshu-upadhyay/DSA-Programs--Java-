import javax.lang.model.util.ElementScanner14;

class node
{
    node left;
    int data;
    node right;
}

class BinarySearchTree
{
    public static node createnode(int data) 
    {
        node newnode = new node();
        newnode.data = data;
        return newnode;
    }

    public static void preordertraversal(node root)
    {
        if (root!=null) 
        {
            System.out.print(root.data + " ");
            preordertraversal(root.left);
            preordertraversal(root.right);
        }
    }

    public static void postordertraversal(node root)
    {
        if (root!=null) 
        {
            postordertraversal(root.left);
            postordertraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void inordertraversal(node root)
    {
        if (root!=null) 
        {
            inordertraversal(root.left);
            System.out.print(root.data + " ");
            inordertraversal(root.right);
        }
    }

    static node pre = null;

    public static int isBST(node root)
    {
        if (root!=null) 
        {
            if (isBST(root.left) != 1) 
            {
                return 0;
            }
            if (pre != null && root.data<=pre.data) 
            {
                return 0;
            }
            pre = root;
            return isBST(root.right);
        }
        return 1;
 
    }

    public static int searchBST(node root, int key)
    {
        if (root!=null) 
        {
            if (root.data == key) 
            {
                return 1;    
            }
            else if(root.data > key)
            {
                return searchBST(root.left, key);
            }
            else
            {
                return searchBST(root.right, key);
            }
        }
        return 0;
    }


    // static node pre1 = null;
    public static void insertBST(node root, int val)
    {

        if (root.left!=null || root.right!=null ) 
        {
            // pre1 = root;
            if(root.data > val)
            {
                insertBST(root.left, val);
            }
            else if(root.data < val)
            {
                insertBST(root.right, val);
            }
            else
            {
                System.out.println("Data cannot be inserted....");
            }
        }
        else
        {
            node p = createnode(val);     
            if(root.data > val)
            {
                root.left= p; 
            }
            else
            {
                root.right= p; 
            }
            // pre1.left= p; 
            System.out.println("Data Inserted Sucessfully....");
        }

    }

    public static void main(String[] args) {
        
        node p = createnode(15);
        node p1 = createnode(10);
        node p2 = createnode(5);
        node p3 = createnode(12);
        node p4 = createnode(21);
        node p5 = createnode(17);
        node p6 = createnode(25);

        /*
        Binary Search Trees: 

                        15
                    /       \
                   10        21
                 /   \      /   \
                5     12   17   25

        */

        // Making Tree Formation

        p.left = p1;
        p.right = p4;
        p1.left = p2;
        p1.right = p3;
        p4.left  = p5;
        p4.right = p6;

        // while (true) 
        // {
        //     /*
        //     System.out.println("\n----- Binary Search Tree Operations -----\n");

        //     System.out.println("1- Pre-Order Traversal");
        //     System.out.println("2- Post-Order Traversal");
        //     System.out.println("3- In-Order Traversal");
        //     System.out.println("4- Check for Binary Search Tree.");
        //     */
        //     // inordertraversal(p);
            
            
        // }
        // System.out.println(isBST(p));
        // System.out.println(checkbstusing(p));
        // checkbstusing(p);   

        // System.out.println(searchBST(p, 27));
        // insertBST(p, 10);
        // preordertraversal(p);
        System.out.println(p6.right);
        
        
    }

}