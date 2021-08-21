
class node
{
    node left;
    int data;
    node right;
}

class trees
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
    public static void main(String[] args) {
        
        node p = createnode(4);
        node p1 = createnode(1);
        node p2 = createnode(6);
        node p3 = createnode(5);
        node p4 = createnode(2);
        node p5 = createnode(8);
        node p6 = createnode(7);

        /*
        Trees: 
                       4
                   /      \
                  1        6
                /   \     /  \
               5     2   8    7
        */

        // Making Tree Formation
        p.left = p1;
        p.right = p2;
        p1.left = p3;
        p1.right = p4;
        p2.right = p6;
        p2.left  = p5;

        System.out.println("------Pre-Order Traversal-------");
        preordertraversal(p);
        System.out.println();
        
        System.out.println("------Post-Order Traversal------");
        postordertraversal(p);
        System.out.println();

        System.out.println("------In-Order Traversal--------");
        inordertraversal(p);
        System.out.println();
    }

}