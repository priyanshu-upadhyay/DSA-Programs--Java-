import java.util.Scanner;

class node
{
    node previous;
    int data;
    node next;
}


public class armstrongnumberdoubly 
{

    node START;

    armstrongnumberdoubly()
    {
        START = null;
    }


    void insert_end()
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
            while(current.next != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.print(current.data+"\n");

            System.out.println("\n\n----------Reverse Direction----------\n\n");

            while (current!=null) 
            {
                System.out.print(current.data+" ");
                current = current.previous;
            }

        }


    }

    void insert_begin()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the Element: ");
        int data = sc1.nextInt();
        node newnode = new node();
        newnode.previous = null;
        newnode.data = data;
        newnode.next = START;
        if(START != null)
        START.previous = newnode;
        START = newnode;
        System.out.println("Data Inserted Sucessfully !!");
    }

    static int isarmstrong(int n)
    {
        int temp, digits=0, last=0, sum=0;   

        temp=n;   

        while(temp>0)    
        {   
        temp = temp/10;   
        digits++;   
        }   
        temp = n;   
        while(temp>0)   
        {   
        
        last = temp % 10;   

        sum +=  (Math.pow(last, digits));   
        
        temp = temp/10;   
        }  
        
        if(n==sum)   

        return 1;      
        
        else return 0;   
    }

    void countarmstrongno()
    {
        if (START == null) 
        {
            System.out.println("\n\nDoubly LinkedList is Empty !!");
        }
        else
        {
            int armstrong = 0;
            node current = START;
            while(current != null)
            {
                if(isarmstrong(current.data) == 1)
                {
                    armstrong++;
                }
                current = current.next;
            }
            System.out.println("No. of Armstrong Number "+ armstrong);
        }
    }

    public static void main(String[] args) 
    {
        armstrongnumberdoubly obj = new armstrongnumberdoubly();
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("\n------Doubly Linked List Operations------\n");
            System.out.println("1- Travesing LinkedList");
            System.out.println("2- Inserting an item in the LinkedList");
            System.out.println("3- Count Armstrong Numbers");
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
               obj.countarmstrongno();
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
