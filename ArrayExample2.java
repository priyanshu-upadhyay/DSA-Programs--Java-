import java.util.Scanner;

public class ArrayExample2 {
    ArrayExample2() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n------Printing Array------------\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value of element " + (i + 1) + " is: " + arr[i]);
        }
    }

    public static void main(String[] args) {

        ArrayExample2 obj = new ArrayExample2();
    }
}
