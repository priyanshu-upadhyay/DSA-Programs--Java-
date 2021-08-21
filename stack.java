import java.util.Scanner;

public class stack {
    int arr[];
    int top;
    
    stack()  // constructor
    {
            
        arr = new int[5];
        top = -1;
    
    }
    
    void push() // insert
    {
        if (top==4) 
        {
            System.out.println("Stack is Overflow...");
        }
        else
        {
            System.out.print("Enter the element: ");
            Scanner sc2 = new Scanner(System.in);
            int data = sc2.nextInt();
            top = top + 1;
            arr[top] = data;
            System.out.println("Data Instered..");
        }
    }

    void pop() // Delete
    {
        if (top==-1) {
            System.out.println("Stack is Underflow...");
        }
        else
        {
            System.out.println("Deleted Element: "+arr[top]);
            top = top - 1; 
        }

    }

    void traverse() // Show
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty...");
        }
        else{
            for (int i = top; i >=0; i--) {
                System.out.println(arr[i]);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack obj = new stack();
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
