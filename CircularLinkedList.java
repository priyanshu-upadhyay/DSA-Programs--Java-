
import java.util.Scanner;


class node
{
    int data;
    node next;
}



public class CircularLinkedList {

    node START;
    CircularLinkedList()
    {
        START = null;
    }


    void traverse()
    {
        if (START == null) 
        {
            System.out.println("\n.................................");
            System.out.println("Circular Linked List is Empty");
            System.out.println(".................................\n");
        }
        else
        {
            System.out.println("\n.................................");
            System.out.println("Circular Linked List: ");
            System.out.println(".................................\n");
            node current = START;
            do 
            {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != START); 
        }
    }

    void delete_end()
    {
        if (START == null) 
        {
            System.out.println("Circular Linked List is Empty....");    
        }
        else
        {
            if (START.next == START) 
            {
                System.out.println("\nDeleted Element: "+START.data);
                START = null;    
            }
            else
            {
                node current = START;
                while (current.next.next != START) 
                {
                    current = current.next;
                }
                System.out.println("\nDeleted Element: "+current.next.data);
                current.next = START;
            }
        }
        
    }
    
    void delete_begin()
    {
        System.out.println("\nDeleted Element: "+START.data);
        if (START == null) 
        {
            System.out.println("Circular Linked List is Empty....");    
        }
        else
        {
            if (START.next == START) 
            {
                START = null;    
            }
            else
            {
                node current = START;
                while(current.next!=START)
                {
                    current = current.next;
                }
                START = START.next;
                current.next = START;
            }
        }
    }



    void insert_begin()
    {

        node newnode = new node();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the Element: ");
        int data = sc1.nextInt();
        if (START == null) 
        {
            newnode.next = newnode;
        }
        else
        {
            node current = START;

            newnode.next = START;

            while (current.next!=START)
            {
                current = current.next;
            }
            current.next = newnode;

        }
        newnode.data = data;
        START = newnode;
        System.out.println("\nData Inserted Successfully...");
    }

    void insert_end()
    {
        node newnode = new node();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the Element: ");
        int data = sc2.nextInt();

        if (START == null) 
        {
            START = newnode;
            
        }
        else
        {
            node current = START;
            while (current.next != START) 
            {
                current = current.next;
            }
            current.next = newnode;      
        }
        newnode.next = START;
        newnode.data = data;
        System.out.println("\nData Inserted Successfully...");
    }

    public static void main(String[] args) {
        
        CircularLinkedList obj = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) 
        {
            System.out.println("\n------Circular Linked List Operations------\n");
            System.out.println("1- Travesing");
            System.out.println("2- Inserting an item");
            System.out.println("3- Deleting an item");
            System.out.println("4- Exit from the System");
            System.out.print("Enter Choice (1-4): ");

            int choice = sc.nextInt();

            if (choice == 1) 
            {
                obj.traverse();
            }

            else if(choice == 2)
            {
                System.out.println("\n------Insertion into a singly-linked list has three cases------\n");


                System.out.println("1- Inserting at Begin");
                System.out.println("2- Inserting at Last");
                System.out.print("Enter Choice (1-2): ");


                int insertion_choice = sc.nextInt();
                if (insertion_choice == 1) 
                {
                    obj.insert_begin();
                }

                else if(insertion_choice == 2)
                {
                    obj.insert_end();
                }
                else
                {
                    System.out.println("Invalid Choice");
                }

            }

            else if(choice == 3)
            {
                System.out.println("\n------Deletion into a singly-linked list has three cases------\n");

                System.out.println("1- Deleting the first node");
                System.out.println("2- Deleting the last node");

                System.out.print("Enter Choice (1-2): ");
                int insertion_choice = sc.nextInt();

                if (insertion_choice == 1) 
                {
                    obj.delete_begin();
                }

                else if(insertion_choice == 2)
                {
                    obj.delete_end();
                }

                else
                {
                    System.out.println("Invalid Choice");
                }

            }

            else if(choice == 4)
            {
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
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

