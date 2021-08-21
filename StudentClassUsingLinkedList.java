
import java.util.Scanner;
class node
{
    int rollno;
    String name;
    node next;
}



public class StudentClassUsingLinkedList {

    node start;
    StudentClassUsingLinkedList()
    {
        start = null;
    }
    void traverse()
    {
        node current  = start;
        if(start == null)
        {
            System.out.println("Singly Linked List is Empty.");
        }
        else
        {
            System.out.println("Travesing.........");
            while(current!=null)
            {
                System.out.println(current.rollno+" "+current.name+" ");
                current = current.next;
            }
        }
    }
    void delete()
    {
        node current = start;
        if(start == null)
        {
            System.out.println("LinkedList is Empty.");
        }
        else
        {
            while (current.next.next != null) 
            {
                current = current.next;
            }
            current.next = null;
            System.out.println("Element Deleted......");
        }
    }
    void insert()
    {
        Scanner sc2 = new Scanner(System.in);

        System.out.print("\nEnter Roll Number: ");
        int rollno = sc2.nextInt();

        System.out.print("\nEnter Name: ");
        String name= sc2.next();

        node newnode  = new node();

        newnode.rollno = rollno;
        newnode.name = name;

        newnode.next = start;                   
        start = newnode;                       
        System.out.println("Data inserted at begin....\n");
    }

    void search()
    {

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StudentClassUsingLinkedList obj = new StudentClassUsingLinkedList();
        while(true)
        {
            System.out.println("1- Travese");
        System.out.println("2- Insert");
        System.out.println("3- Delete");
        System.out.println("4- Search");
        System.out.println("5- Exit");
        System.out.print("Enter Your Choice: ");
        int ch = sc.nextInt();
        if (ch == 1) 
        {
            obj.traverse();
        }
        else if(ch == 2)
        {
            obj.insert();
        }
        else if(ch == 3)
        {
            obj.delete();
        }
        else if(ch == 4)
        {
            // obj.search();
        }
        else if(ch == 5)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid Choice...");
        }
        }
        
        
    }
}
