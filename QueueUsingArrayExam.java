import java.util.Scanner;

public class QueueUsingArrayExam {

    int front, rear, arr[];

    QueueUsingArrayExam()
    {
        arr = new int[5];
        front = -1;
        rear = -1;
    }
    void insert()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Element: ");
        int data = sc1.nextInt();
        if(front == -1 || rear == -1)
        {
            front = 0;
            rear = 0;
        }
        else
        {
            rear++;
        }
        if(rear == 5)
        {
            System.out.println("Queue is Full...");
            rear--;
        }
        else
        {
            arr[rear] = data;
            System.out.println("Data Inserted....");
        }

    }
    void delete()
    {
        if(front<rear)
        {
            front++;
        }
        else if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        System.out.println("Data Deleted.......");
    }
    void traverse()
    {
        if(front == -1 || rear == -1)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            for (int i = front; i <= rear; i++) 
            {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) 
    {
        QueueUsingArrayExam obj = new QueueUsingArrayExam();
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
