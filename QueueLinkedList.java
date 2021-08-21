import java.util.Scanner;

class node
{
    int data;
    node next;
}
public class QueueLinkedList 
{
    node FRONT, REAR;
    QueueLinkedList()
    {
        FRONT = null;
        REAR = null;
    }

    void traverse()
    {
        if (FRONT == null || REAR == null) 
        {
            System.out.println("....Queue is Empty....");    
        }
        else
        {
            node current = FRONT;
            while(current != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    }


    void insert()
    {
        node newnode = new node();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int data = sc1.nextInt();
        newnode.data = data;
        newnode.next = null;

        if (FRONT == null || REAR == null) 
        {
            FRONT = newnode;
            REAR = newnode;   
        }
        else
        {
            REAR.next = newnode; 
            REAR = newnode;
        }
    }
    public static void main(String[] args) {
        QueueLinkedList obj = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("\n\n----Singly Queue Operations-----\n");
            System.out.println("Press 1 for insert");            
            System.out.println("Press 2 for delete");            
            System.out.println("Press 3 for traverse");            
            System.out.println("Press 4 for peek");            
            System.out.println("Press 5 for poll");            
            System.out.println("Press 6 for exit");
            
            System.out.print("Enter your Choice(1-6): ");
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    // obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    // obj.peek();
                    break;
                case 5:
                    // obj.poll();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice ");
            }
        }
    }
}
