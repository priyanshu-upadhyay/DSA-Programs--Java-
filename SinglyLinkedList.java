import java.util.Scanner;

class Node
{
    int rollno;
    Node next;
}
public class SinglyLinkedList
{
    Node START;
   
    SinglyLinkedList()
    {
        START = null;
    }
    void addnode()
    {
        System.out.println("Enter you rollno");
        Scanner sc2=new Scanner(System.in);
        int rn=sc2.nextInt();
       
        Node newnode=new Node();
        newnode.rollno=rn;
        newnode.next=null;
       
        if(START==null)
        {
            START=newnode;
        }
        else
        {
            Node current=START;
            while(current.next != null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
        System.out.println("data inserted");
    }
    void deletenodelast()
    {
       if (START==null) {
           System.out.println("List Empty");
       }
       else
       {
            Node current=START.next;
            Node secondlast = null;
            while(current.next != null)
            {
                current=current.next.next;
                secondlast = current.next;
            }
            System.out.println("Deleted: "+secondlast.next);
            // current.next=null;
       }
    }
    void deletenodebegin()
    {
        if (START==null) {
            System.out.println("List Empty");
        }
        else
        {
            System.out.println("Deleted: "+START.rollno);
            START = START.next;
        }
    }
    void traversenode()
    {
        if(START == null)
        {
            System.out.println("list is empty");
        }
        else
        {
            Node current;
            for(current = START; current!= null; current=current.next)
            {
                System.out.print(current.rollno+" ");
            }
            System.out.println();
        }
    }
    void searchnode()
    {
        if(START==null)
        {
            System.out.println("List Empty");
        }
        else
        {
            System.out.println("Enter searching element");
            Scanner sc3=new Scanner(System.in);
            int sea=sc3.nextInt();
           
            int count=0;
            Node current;
            for(current=START; current!=null; current=current.next)
            {f
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
        SinglyLinkedList obj=new SinglyLinkedList();
        while(true)
        {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete last");
            System.out.println("Press 3 for traverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for delete begin");
            System.out.println("Press 6 for exit");
           
            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
           
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletenodelast();
                    break;
                case 3:
                    obj.traversenode();
                    break;
                case 4:
                    obj.searchnode();
                    break;
                case 5:
                    obj.deletenodebegin();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
           
        }
       
    }
   
}
