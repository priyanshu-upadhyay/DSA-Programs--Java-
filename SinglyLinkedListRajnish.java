
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class node
{
    int data;
    node next;
}

public class SinglyLinkedListRajnish 
{
    node START;

    SinglyLinkedListRajnish()
    {
        START = null;
    }
    
    void traverse()
    {
        if (START == null) 
        {
            System.out.println("Singly LinkedList is Empty");
        }
        else
        {
            node current = START;
            while(current != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        SinglyLinkedListRajnish obj = new SinglyLinkedListRajnish();

        while(true)
        {
            System.out.println("....Singly Linked List Opeartions....");
            System.out.println("1- Traverse");
            System.out.println("2- Insert");
            System.out.println("3- Delete");
            System.out.println("4- Exit");
            System.out.print("Enter Your Choice (1-3): ");
            int choice = sc.nextInt();

            if (choice == 1) 
            {
                obj.traverse();
            }
            else if(choice == 2)
            {

            }
            else if(choice == 3)
            {

            }
            else if(choice == 4)
            {
                System.exit(0);
            }
            else 
            {
                System.out.println("Invalid Choice");
            }

        }
        
        


    }
}
