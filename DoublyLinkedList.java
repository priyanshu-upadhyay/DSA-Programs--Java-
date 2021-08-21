import java.util.Scanner;

class Nodee // don't use Node as class name as both, singly linked list and doubly
{           // linked list are in the same package
    int rollno;
    Nodee previous;
    Nodee next;
}
public class DoublyLinkedList
{
    Nodee START;
    DoublyLinkedList()
    {
        START = null;
    }
    void deletenodevalue()
    {
        
    }
    void addnode()
    {
        System.out.println("Enter data");
        Scanner sc2=new Scanner(System.in);
        int item = sc2.nextInt();
       
        Nodee newnode=new Nodee();
        newnode.rollno = item;
        newnode.previous = null;
        newnode.next = null;
       
        if(START==null)
        {
            START=newnode;
        }
        else
        {
            Nodee current = START;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
            newnode.previous=current;
        }
        System.out.println("Data Inserted");
    }
    void deletenode()
    {
       if(START == null)
       {
           System.out.println("Doubly is Empty");
       }
       else
       {
           if(START.next == null)
           {
               System.out.println("Deleted: "+START.rollno);
               START = null;
           }
           else
           {
                System.out.println("Deleted: "+START.rollno);
                START = START.next;
                START.previous = null;
           }
       }
    }
    void deletelast()
    {
        if(START == null)
       {
           System.out.println("Doubly is Empty");
       }
       else
       {
           if(START.next == null)
           {
               System.out.println("Deleted: "+START.rollno);
               START = START.next;
           }
           else
           {
                Nodee current;
                for(current = START; current.next!=null; current = current.next)
                {
                }
                Nodee secondlast = current.previous;
                secondlast.next = null;
                
           }
       }

    }
    void traversenode()
    {
        if(START == null)
        {
            System.out.println("Doubly List Empty");
        }
        else
        {
            //Forward
            System.out.println("Forward");
            Nodee current;
            for(current=START;current.next!=null;current=current.next)
            {
                System.out.print(current.rollno+" ");
            }
            System.out.println(current.rollno+" ");
            //Reverse
            System.out.println("Reverse");
            Nodee last;
            for(last=current;last!=null;last=last.previous)
            {
                System.out.print(last.rollno+" ");
            }
            System.out.println();
        }
    }
    void searchnode()
    {
        if(START == null)
        {
            System.out.println("List Empty");
        }
        else
        {
            System.out.println("Enter searching element");
            Scanner sc3=new Scanner(System.in);
            int sea=sc3.nextInt();
            int count=0;
           
            for(Nodee current=START;current!=null;current=current.next)
            {
                if(current.rollno == sea)
                {
                    count++;
                    break;
                }
            }
            if(count>0)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
 public static void main(String[] args)
 {
     DoublyLinkedList obj=new DoublyLinkedList();
     while(true)
     {
         System.out.println("Press 1 for insert");
         System.out.println("Press 2 for delete");
         System.out.println("Press 3 for traverse");
         System.out.println("Press 4 for search");
         System.out.println("Press 5 for exit");
         System.out.println("Press 6 for delete last");
         
         System.out.println("Enter your choice: ");
         Scanner sc=new Scanner(System.in);
         
         int ch = sc.nextInt();
         
         if(ch==1)
         {
             obj.addnode();
         }
         else if(ch==2)
         {
             obj.deletenode();
         }
         else if(ch==3)
         {
             obj.traversenode();
         }
         else if(ch==4)
         {
             obj.searchnode();
         }
         else if(ch==5)
         {
             System.exit(0);
         }
         else if(ch==6)
         {
             obj.deletelast();
         }
         else
         {
             System.out.println("Invalid choice entered!");
         }
     }
 }
}

