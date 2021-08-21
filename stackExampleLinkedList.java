import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;



class Node
{
    int data;
    Node next;

}
public class stackExampleLinkedList 
{

    Node top;
    
    stackExampleLinkedList()  // constructor
    {
        top = null;
    }
    
    void push() // insert
    {
        System.out.println("Enter Data: ");
        Scanner sc2 = new Scanner(System.in);
        int newitem = sc2.nextInt();
        Node newnode = new Node();
        newnode.data = newitem;
        newnode.next = top;

        top = newnode;
        System.out.println("Data inserted.....");
        
    }

    void pop() // Delete
    {
        if(top==null){
            System.out.println("Stack is empty....");
        }
        else{
            System.out.println("Deleted Element: "+);
            top = top.next;
        }

    }

    void traverse() // Show
    {
        if(top == null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            Node current;
            for(current = top;current!=null;current!=){
                System.out.println(current.data);
            }
        }
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        stackExampleLinkedList obj = new stackExampleLinkedList();
        while (true) {

            System.out.println("1- PUSH");
            System.out.println("2- POP");
            System.out.println("3- SHOW");
            System.out.println("4- EXIT");
            System.out.print("Enter Your Choice (1-4): ");
    
            int option = sc.nextInt();
            if (option == 1) {
                obj.push();
            } 
            else if (option == 2) {
                obj.pop();
            } 
            else if (option == 3) {
                obj.traverse();
            } 
            else if (option == 4) {
                break;
            } 
            else {
                
                System.out.println("Wrong Choice, Try Again !!");
            }
            System.out.println("\n----------------------------------\n");
        }
    }
}



