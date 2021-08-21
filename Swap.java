import java.util.Scanner;

public class Swap {
    void func() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of var1: ");
        int var1 = sc.nextInt();
        System.out.print("Enter the value of var2: ");
        int var2 = sc.nextInt();
        System.out.println("Container I Value: " + var1);
        System.out.println("Container II Value: " + var2);
        int t;
        t = var1;
        var1 = var2;
        var2 = t;
        System.out.println("\n........After Swaping..........\n");
        System.out.println("Container I Value: " + var1);
        System.out.println("Container II Value: " + var2);

    }

    public static void main(String[] args) {
        Swap obj = new Swap();
        obj.func();
    }
}
