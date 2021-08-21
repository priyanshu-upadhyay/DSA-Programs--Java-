import java.util.Scanner;

class node
{
    float data;
    node link;
}


class LinkedListFloatNumber {

    node START;

    LinkedListFloatNumber()
    {
        START = null;
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




    void insert_end()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("\nEnter Data: ");
        float data = sc2.nextFloat();
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

    void show_sum_mean()
    {
        if (START == null)
        {   
            System.out.println("\nLinkedList is Empty");
        }
        else
        {
            node current;
            float sum = 0;
            int c = 0;
            for(current = START; current!=null; current = current.link)
            {
                sum = sum + current.data;
                c++;
            }
            System.out.println("Sum of Numbers: "+sum);
            float mean = sum/c;
            System.out.println("Mean of Numbers: "+mean);
        }

    }



    public static void main(String[] args) {


        LinkedListFloatNumber obj = new LinkedListFloatNumber();
        Scanner sc = new Scanner(System.in);


        while (true) 
        {
            System.out.println("\n------Singly Linked List Operations------\n");
            System.out.println("1- Travesing LinkedList");
            System.out.println("2- Inserting an item in the LinkedList");
            System.out.println("3- Display the sum and mean of these number.");
            System.out.println("4- Exit from the System");
            System.out.print("Enter Choice (1-4): ");

            int choice = sc.nextInt();

            if (choice == 1) 
            {
                obj.traverse();
                
            }

            else if(choice == 2)
            {
                obj.insert_end();
            }

            else if(choice == 3)
            {
                obj.show_sum_mean();
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
