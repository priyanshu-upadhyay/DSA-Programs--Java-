

import java.util.Scanner;

public class QueueUsingArrays 
{
    int arr[], front, rear;
    QueueUsingArrays()
    {
        arr = new int[5];
        front = -1;
        rear = -1;
    }

    void traverse()
    {
        if ((front == -1 || rear == -1) || front>rear) 
        {
            System.out.println("\n------Queue is Empty------\n");    
        }
        else
        {
            System.out.println("\n------Elements in Queue------\n"); 
            for(int i = front; i<=rear; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    void insert()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the element: ");
        int data = sc1.nextInt();
        if (front == -1 || rear == -1) 
        {
            front = 0; 
            rear = 0;
            arr[rear] = data;
            System.out.println("Data Inserted Sucessfully.....");
        }
        else if(front == 4 || rear == 4)
        {
            System.out.println("No Space Left in Queue");
        }
        else
        {
            rear++; 
            arr[rear] = data;
            System.out.println("Data Inserted Sucessfully.....");
        }
    }
    void delete()
    {
        if ((front == -1 || rear == -1)) 
        {
            System.out.println("Queue is empty....");
        }
        else
        {
            System.out.println("Deleted Element: "+arr[front]);
            front = front + 1;
            if (front>rear) 
            {
                front = -1;
                rear = -1;   
            }
        }  
    }

    public static void main(String[] args) 
    {
        QueueUsingArrays obj = new QueueUsingArrays();
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("\n\n------Queue Using Arrays Operations--------\n");
            System.out.println("1- Insert");
            System.out.println("2- Delete");
            System.out.println("3- Traverse");
            System.out.println("4- Exit");
            System.out.print("Enter Your Choice(1-4): ");
            int ch = sc.nextInt();
            if (ch == 1) 
            {
                obj.insert();
            }
            else if(ch == 2)
            {
                obj.delete();
            }
            else if(ch == 3)
            {
                obj.traverse();
            }
            else if(ch == 4)
            {
                System.exit(0);;
            }
            else
            {
                System.out.println("Invalid Choice");
            }
        }

    }
}
