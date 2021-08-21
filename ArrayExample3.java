import java.util.Scanner;

public class ArrayExample3 {
    ArrayExample3() {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Person " + (i + 1) + " : ");
            arr[i] = sc.next();
        }
        System.out.println("\n------Printing Array------------\n");
        for (String i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        ArrayExample3 obj = new ArrayExample3();
    }
}
