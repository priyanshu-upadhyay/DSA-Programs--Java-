import java.util.Scanner;

class SinglyQueueArray 
{
    int arr[];
    int Front, Rear;
    SinglyQueueArray()
    {
        arr = new int[5];
        Front = -1;
        Rear = -1;

    }
    void insert()
    {
        if (Rear == 4) 
        {
            System.out.println("Queue is overflow...");            
        }
        else
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Enter the element: ");
            int data = sc1.nextInt();
            if(Front == -1)
            {
                Front = 0;
            }
            Rear = Rear + 1;
            arr[Rear] = data;
            System.out.println(".......Data Inserted......");
        }

    }
    void peek()  // Last Element
    {
        if (Front == -1 || Rear == -1)
        {
            System.out.println("Singly Queue is Empty");     
        }
        else
        {
            System.out.println("Last Element: "+arr[Rear]);
        } 

    }
    void poll()   // First Element
    {
        if (Front == -1 || Rear == -1)
        {
            System.out.println("Singly Queue is Empty");     
        }
        else
        {
            System.out.println("First Element: "+arr[Front]);
        }

    }
    void delete()
    {
        if (Front == -1) 
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            if (Front<Rear)
            {
                System.out.println("Deleted ELement: "+arr[Front]);
                Front = Front + 1;
            }
            else if(Front == Rear)
            {
                System.out.println("Deleted ELement: "+arr[Front]);
                Front = -1;
                Rear = -1;
            }
        }
    }
    void traverse()
    {
        if (Front == -1 || Rear == -1)
        {
            System.out.println("Singly Queue is Empty");     
        }
        else
        {
            System.out.println("\n-------Singly Queue-------\n");
            for(int i=Front;i<=Rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        SinglyQueueArray obj = new SinglyQueueArray();
        while (true)
        {
            System.out.println("\nPress 1 for insert");            
            System.out.println("Press 2 for delete");            
            System.out.println("Press 3 for traverse");            
            System.out.println("Press 4 for peek");            
            System.out.println("Press 5 for poll");            
            System.out.println("Press 6 for exit");
            
            System.out.print("Enter your Choice(1-6): ");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.peek();
                    break;
                case 5:
                    obj.poll();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice ");
            }
        }
    }
}
