import java.util.Scanner;

class node
{
    int data;
    node link;
}


class SinglyLinkedListFinal {

    node START;

    SinglyLinkedListFinal()
    {
        START = null;
    }


    void deldup()
    {
        node current = START;
        while (current.link!= null) 
        {
            node newcur = current;
            while (current.data == newcur.data) 
            {
                newcur = newcur.link;
            }
            
            if (START == current) 
            {
                START = newcur;    
            }
            else if(current.link == newcur)
            {
                current.link = newcur;
            }
            else
            {
                current = current.link;
            }
        }
    }

    void traverse()
    {
        if (START == null)
        {   
            System.out.println("\nLinkedList is Empty");
        }
        else
        {
            node current;
            System.out.println("\n-------Elements in Linked List---------\n");
            for(current = START; current!=null; current = current.link)
            {
                System.out.print(current.data + " ");
            }
            System.out.println();
        }
    }
    void search()
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the element to Search: ");
        int ele = sc3.nextInt();

        int f = 0;
        if (START == null)
        {   
            
        }
        else
        {
            node current;
            for(current = START; current!=null; current = current.link)
            {
                if(current.data == ele)
                {
                    f = 1;
                    break;
                }
            }
        }
        if(f==1)
        {
            System.out.println("Element Found.");
        }
        else
        {
            System.out.println("Element Not Found.");
        }
    }


    void delete_begin()
    {
        if (START == null)
        {   
            System.out.println("\nLinkedList is Empty");
        }
        else
        {
            System.out.println("\n\nElement Deleted: "+START.data);

            START = START.link;

        }
    }

    void delete_end()
    {
        if (START == null)
        {   
            System.out.println("\nLinkedList is Empty");
        }
        else
        {
            node current = START, seclst = START;
            int f = 0;
            while(current.link != null)
            {
                seclst = current;
                current = current.link;
                f = 1;

            }

            if (f==1)
            {
                seclst.link = null;
            }
            else
            {
                START = null;
            }
            System.out.println("\n\nElement Deleted: "+current.data);
        }
    }

    void delete_pos()
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("\nEnter Position for Deletion: ");
        int pos = sc3.nextInt();
        if(START == null)
        {
            System.out.println("\nLinkedList is Empty");
        }
        else
        {
            int counter = 1;
            node current = START;
            while (counter<pos-1) 
            {
                current = current.link;
                counter++;
            }
            System.out.println("\n\nData Inserted: "+current.link.data);
            current.link = current.link.link;
        }
    }


    void insert_begin()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("\nEnter Data: ");
        int data = sc1.nextInt();
        node newnode  = new node();             // Allocating Memory for a NewNode
        newnode.data = data;
        newnode.link = START;                   // Assigning START address to newnode Link
        START = newnode;                        // Now Changing START address to Initial Position
        System.out.println("Data inserted at begin....\n");
    }



    void insert_end()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("\nEnter Data: ");
        int data = sc2.nextInt();
        node newnode = new node();
        newnode.data = data;
        newnode.link = null;
        if(START == null)
        {
            START = newnode;
        }
        else
        {
            node current = START;
            while (current.link!=null)
            {
                current = current.link;
            }
            current.link = newnode;
        }

        System.out.println("Data Inserted at the end.....\n");
    }


    void insert_pos()
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("\nEnter Position for Insertion: ");
        int pos = sc3.nextInt();
        System.out.print("Enter the Data to Insert: ");
        int data = sc3.nextInt();
        node newnode = new node();
        newnode.data = data;
        if(START == null)
        {
            newnode.link = null;
            START = newnode;
        }
        else
        {
            int counter = 1;
            node current = START;
            while (counter<pos-1) 
            {
                current = current.link;
                counter++;
            }
            newnode.link = current.link;
            current.link = newnode;
        }
        System.out.println("Data Inserted.....\n");
    }
    // static node reversetraverse(node START)
    // {
    //     if (START== null) 
    //     {
    //         return ;
    //     }
    //     reversetraverse(START.next);
    //     System.out.println(START.data);
    // } 


    public static void main(String[] args) {


        SinglyLinkedListFinal obj = new SinglyLinkedListFinal();
        Scanner sc = new Scanner(System.in);


        while (true) 
        {
            System.out.println("\n------Singly Linked List Operations------\n");
            System.out.println("1- Travesing LinkedList");
            System.out.println("2- Inserting an item in the LinkedList");
            System.out.println("3- Deleting an item from the LinkedList");
            System.out.println("4- Deleting Duplicates");
            System.out.println("5- Exit from the System");
            System.out.print("Enter Choice (1-5): ");

            int choice = sc.nextInt();

            if (choice == 1) 
            {
                obj.traverse();
                // reversetraverse(START);
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
                    obj.insert_begin();
                }

                else if(insertion_choice == 2)
                {
                    obj.insert_end();
                }

                else if(insertion_choice == 3)
                {
                    obj.insert_pos();
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
                int insertion_choice = sc.nextInt();

                if (insertion_choice == 1) 
                {
                    obj.delete_begin();
                }

                else if(insertion_choice == 2)
                {
                    obj.delete_end();
                }

                else if(insertion_choice == 3)
                {
                    obj.delete_pos();
                }

                else
                {
                    System.out.println("Invalid Choice");
                }

            }

            else if(choice == 4)
            {
                obj.deldup();
            }
            else if(choice == 5)
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
