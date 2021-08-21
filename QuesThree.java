import java.util.Scanner;

class Node
{
    int data;
    String name;
    Node next;

}

public class QuesThree 
{
    Node top;
    QuesThree()
    {
        top = null;
    }
    void push() 
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the Student Id: ");
        int value = sc1.nextInt();
        System.out.print("Enter the Student Name: ");
        String name = sc1.next();

        Node newnode = new Node();
        newnode.data = value;
        newnode.name = name;
        newnode.next = top;
        top = newnode;
        System.out.println("\nData Inserted\n");

    }
    void pop()
    {
        if (top == null) 
        {
            System.out.println("Stack is Empty");
        } 
        else 
        {
            System.out.println("Deleted Element: "+top.data);
            top = top.next;
        }
    }
    void traverse()
    {
        if(top == null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(Node current = top; current!=null; current = current.next)
            {
                System.out.println(current.data + " " + current.name);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        QuesThree obj = new QuesThree();
        Scanner sc = new Scanner(System.in);
        while(true)
        {

            System.out.println("1- Insert element (Push)");
            System.out.println("2- Delete element (Pop)");
            System.out.println("3- Display Stack ");
            System.out.println("4- Exit");
            System.out.print("Enter Your Choice (1-4): ");
            
            int choice = sc.nextInt();
    
            if(choice == 1)
            {
                obj.push();
            }
            else if(choice == 2)
            {
                obj.pop();
            }
            else if(choice == 3)
            {
                obj.traverse();
            }
            else if(choice == 4)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid Choice.");
            }

        }


    }
}
