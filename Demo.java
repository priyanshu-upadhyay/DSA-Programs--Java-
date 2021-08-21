import java.util.Scanner;

class Demo {
    void func() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value I: ");
        int var1 = sc.nextInt();
        System.out.print("Enter the Value II: ");
        int var2 = sc.nextInt();
        System.out.println("The Sum is: " + (var1 + var2));

    }

    public static void main(String[] args) {
        System.out.println("Hello World...");
        Demo obj = new Demo();
        obj.func();
    }
}