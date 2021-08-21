import java.util.Scanner;


class node
{
    int data;
    node next;
}

public class StackUsingLinkedList {

    node top;
    StackUsingLinkedList()
    {
        top = null;
    }
    void push()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the Element: ");
        int data = sc1.nextInt();
        node newnode = new node();
        if(top == null)
        {
            top = newnode;
        }
        else
        {
            node current = top;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newnode;
        }
        newnode.next = null;
        newnode.data = data;
        System.out.println("Data Inserted......");
    }

    void pop()
    {
        if(top == null)
        {
            System.out.println("Stack is Empty..");
        }
        else
        {
            node current = top;
            while(current.next.next != null)
            {
                current = current.next;
            }
            System.out.println("Data Deleted: "+current.next.data);
            current.next = null;
        }
        
    }s

    void traverse()
    {
        node current = top;
        while(current != null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StackUsingLinkedList obj = new StackUsingLinkedList();
        while(true)
        {
            System.out.println("\n\n------Stack Using LinkedList Operations------\n");
            System.out.println("1- Push (Insert)");
            System.out.println("2- Pop (Delete)");
            System.out.println("3- Show Stack");
            System.out.println("4- Exit");
            System.out.print("Enter Your Choice (1-4): ");
            int ch = sc.nextInt();

            if (ch == 1) 
            {
                obj.push();
            }
            else if(ch == 2)
            {
                obj.pop();
            }
            else if(ch == 3)
            {
                obj.traverse();
            }
            else if(ch == 4)
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
