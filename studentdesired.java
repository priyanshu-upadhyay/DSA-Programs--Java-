import java.util.Scanner;

class node
{
    node previous;
    int studentid;
    String studentname;
    int studentage;
    node next;  
}


public class studentdesired 
{

    node START;

    studentdesired()
    {
        START = null;
    }

    void delete_end()
    {
        if (START == null) 
        {
            System.out.println("\n\nLinked List is Empty");   
        }
        else
        {
            node current = START;
            while (current.next != null) 
            {
                current = current.next;    
            }
            // System.out.println("\n\nElement Deleted: "+current.data);
            if(current.previous != null)
            {
                current.previous.next = null;
            }
            else
            {
                START = null;
            }
        }
    }
    void byname()
    {

    }
    void byage()
    {

    }
    void byid()
    {
        node current,nextcurrent;

        for(current = START; current.next!=null;current = current.next)
        {
            node sortdata = current;
            for(nextcurrent = current.next; current!=null; nextcurrent = nextcurrent.next)
            {
                if (nextcurrent.studentid < sortdata.studentid)
                {
                    sortdata = nextcurrent;
                }
            }
            System.out.println(nextcurrent.studentid);
            
        }
    }



    void delete_begin()
    {
        if (START == null) 
        {
            System.out.println("\n\nLinked List is Empty");   
        }
        else
        {
            // System.out.println("\n\nElement Deleted: "+START.data);
            START = START.next;
            if (START != null) 
            START.previous = null;
        }
    }

    void insert_end()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the Student ID: ");
        int studentid = sc2.nextInt();
        System.out.print("Enter the Student Name: ");
        String studentname = sc2.next();
        System.out.print("Enter the Student Age: ");
        int studentage = sc2.nextInt();
        node newnode = new node();

        if(START == null)
        {
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
            newnode.next = null;
            newnode.previous = current;
            current.next = newnode;
        }
        newnode.studentid = studentid;
        newnode.studentname = studentname;
        newnode.studentage = studentage;
        System.out.println("Data Inserted Sucessfully !!");
    }


    // void traverse()
    // {

    //     if (START == null) 
    //     {
    //         System.out.println("\n\nDoubly LinkedList is Empty !!");
    //     }
    //     else
    //     {
    //         System.out.println("\n\n----------Forward Direction----------\n\n");

    //         node current = START;
    //         while(current.next != null)
    //         {
    //             System.out.print(current.data+" ");
    //             current = current.next;
    //         }
    //         System.out.print(current.data+"\n");

    //         System.out.println("\n\n----------Reverse Direction----------\n\n");

    //         while (current!=null) 
    //         {
    //             System.out.print(current.data+" ");
    //             current = current.previous;
    //         }

    //     }


    // }

    // void insert_begin()
    // {
    //     Scanner sc1 = new Scanner(System.in);
    //     System.out.print("Enter the Element: ");
    //     int data = sc1.nextInt();
    //     node newnode = new node();
    //     newnode.previous = null;
    //     newnode.studentid = studentid;
    //     newnode.studentname = studentname;
    //     newnode.studentage = studentage;
    //     newnode.next = START;
    //     if(START != null)
    //     START.previous = newnode;
    //     START = newnode;
    //     System.out.println("Data Inserted Sucessfully !!");
    // }




    public static void main(String[] args) 
    {
        studentdesired obj = new studentdesired();
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("\n------Doubly Linked List Operations------\n");
            System.out.println("1- Travesing LinkedList");
            System.out.println("2- Inserting an item in the LinkedList");
            System.out.println("3- Deleting an item from the LinkedList");
            System.out.println("4- Exit from the System");
            System.out.print("Enter Choice (1-4): ");

            int choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.println("\n---Desired Output---\n");
                System.out.println("1- By Student Name");
                System.out.println("2- By Student ID");
                System.out.println("3- By Student Age");
                int ch = sc.nextInt();
                if (ch == 1) 
                {
                    obj.byname();
                }
                else if(ch == 2)
                {
                    obj.byid();
                }
                else if(ch == 3)
                {
                    obj.byage();
                }
                else
                {
                    System.out.println("Invalid Choice...");
                }
            }

            else if(choice == 2)
            {
                System.out.println("\n------Insertion into a singly-linked list has three cases------\n");


                System.out.println("1- Inserting at Begin");
                System.out.println("2- Inserting at Last");
                System.out.println("3- Inserting an intermediate node");
                System.out.print("Enter Choice (1-3): ");


                int insertion_choice = sc.nextInt();
                if (insertion_choice == 1) 
                {
                    // obj.insert_begin();
                }

                else if(insertion_choice == 2)
                {
                    obj.insert_end();
                }

                else if(insertion_choice == 3)
                {
                    System.out.println("In Development Phase.");
                    // obj.insert_pos();
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
                System.out.println("3- Deleting an intermediate node");

                System.out.print("Enter Choice (1-3): ");
                int deletion_choice = sc.nextInt();

                if (deletion_choice == 1) 
                {
                    obj.delete_begin();
                }

                else if(deletion_choice == 2)
                {
                    obj.delete_end();
                }

                else if(deletion_choice == 3)
                {
                    System.out.println("In Development Phase.");
                    // obj.delete_pos();
                }

                else
                {
                    System.out.println("Invalid Choice");
                }

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
