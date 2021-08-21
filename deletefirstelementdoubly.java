import java.util.Scanner;

class node
{
    node previous;
    int data;
    node next;
}


public class deletefirstelementdoubly 
{

    node START;

    deletefirstelementdoubly()
    {
        START = null;
    }

    void delete_begin_addlast()
    {
        if (START == null) 
        {
            System.out.println("\n\nLinked List is Empty");   
        }
        else
        {
            int data = START.data;
            node newnode = new node();

            if(START == null)
            {
                newnode.data = data;
                newnode.next = null;
                newnode.previous = null;
                START = newnode;
            }
            else
            {
                node current = START;
                while(current.next != null)
                {
                    current = current.next;
                }
                newnode.data = data;
                newnode.next = null;
                newnode.previous = current;
                current.next = newnode;
            }
            START = START.next;
            if (START != null) 
            START.previous = null;
            System.out.println("Data deleted from begin and Inserted at last Sucessfully !!");
        }
    }
    void traverse()
    {

        if (START == null) 
        {
            System.out.println("\n\nDoubly LinkedList is Empty !!");
        }
        else
        {
            System.out.println("\n\n----------Forward Direction----------\n\n");

            node current = START;
            while(current != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }


        }


    }
    void insert()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the Element: ");
        int data = sc2.nextInt();
        node newnode = new node();

        if(START == null)
        {
            newnode.data = data;
            newnode.next = null;
            newnode.previous = null;
            START = newnode;
        }
        else
        {
            node current = START;
            while(current.next != null)
            {
                current = current.next;
            }
            newnode.data = data;
            newnode.next = null;
            newnode.previous = current;
            current.next = newnode;
        }
        System.out.println("Data Inserted Sucessfully !!");
    }




    public static void main(String[] args) 
    {
        deletefirstelementdoubly obj = new deletefirstelementdoubly();
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("\n------Doubly Linked List Operations------\n");
            System.out.println("1- Travesing LinkedList");
            System.out.println("2- Deleting an first item and add to last");
            System.out.println("3- Insert Element");
            System.out.println("4- Exit from the System");
            System.out.print("Enter Choice (1-4): ");

            int choice = sc.nextInt();
            if (choice == 1) 
            {
                obj.traverse();
            }

            else if(choice == 2)
            {
                obj.delete_begin_addlast();

            }
            else if(choice == 3)
            {
                obj.insert();
            }
            else if(choice == 4)
            {
                System.exit(0);
            }

            else
            {
                System.out.println("Invalid Choice");
            }

            System.out.println();
        }

        
    }
}
