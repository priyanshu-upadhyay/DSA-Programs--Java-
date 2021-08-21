
import java.util.Scanner;

import java.lang.Math;  

public class armstrongqueue 
{
    int arr[];
    int Front, Rear;
    armstrongqueue()
    {
        arr = new int[5];
        Front = -1;
        Rear = -1;
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
    void insert()
    {
        if((Front==0 && Rear==4 ) || Rear==Front-1)
        {
            System.out.println("Circular Queue is Full");
        }
        else
        {
            System.out.println("Enter Data: ");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            if(isarmstrong(data) == 0)
            {
                System.out.println("Number is not armstrong.");
            }
            else
            {
                if(Front == -1 || Rear == -1)
                {
                    Front = 0;
                    Rear = 0;
                }
                else if(Rear<4)
                {
                    Rear = Rear + 1;
                }
                else if(Rear==4 && Front!=0)
                {
                    Rear = 0;
                }
                arr[Rear] = data;
                System.out.println("Data inserted....");
            }




        }


    }

    void delete()
    {
        if(Front == 1)
        {
            System.out.println("Circular Queue is empty");
        }
        else
        {
            if(Front==Rear)
            {
                System.out.println("Deleted: "+arr[Front]);
                Front = -1;
                Rear = -1;
            }
            else if(Front<Rear)
            {
                System.out.println("Deleted: "+arr[Front]);
                Front = Front + 1;

            }
            else if(Rear<Front && Front==4)
            {
                System.out.println("Deleted: "+arr[Front]);
                Front = 0;
            }
            else if(Front<4)
            {
                System.out.println("Deleted: "+arr[Front]);
                Front = Front + 1;
            }
        }

    }

    void traverse()
    {
        if(Front==-1 || Rear==-1)
        {
            System.out.println("Circular Queue Empty.");
        }
        else
        {
            if(Front<=Rear)
            {
                for (int i = Front; i <= Rear; i++) 
                {
                    System.out.print(" "+arr[i]); 
                }
            }
            else
            {
                for(int i=Front;i<=4;i++)
                {
                    System.out.print(" "+arr[i]);
                }
                for(int i=0;i<=Rear;i++)
                {
                    System.out.print(" "+arr[i]);
                }
            }
        }

    }
    void peek()  // Last Element
    {
        if (Front == -1 || Rear == -1)
        {
            System.out.println("Circular Queue is Empty");     
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
            System.out.println("Circular Queue is Empty");     
        }
        else
        {
            System.out.println("First Element: "+arr[Front]);
        }

    }

    public static void main(String[] args) 
    {
        armstrongqueue obj = new armstrongqueue();
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
