import java.util.Scanner;

class student
{
    String name;
    int price;

}

public class queueexam 
{
    int front,rear;
    student arr[];
    queueexam()
    {
        front = -1;
        rear = -1;
        arr = new student[5];
    }
    void insert()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = sc.next();
        System.out.print("Enter the price: ");
        int price = sc.nextInt();
        student objstd = new student();
        objstd.name = name;
        objstd.price = price;
        front++;
        rear++;
        arr[rear] = objstd;


    }
    public static void main(String[] args) 
    {
        queueexam obj = new queueexam();
        obj.insert();
    }

}
