import java.util.Scanner;

public class ArrayExample5 {
    ArrayExample5() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 0) {
                c = c + 1;
            }
        }
        System.out.println("The no. of +ves are: " + (10 - c));
        System.out.println("The no. of -ves are: " + (c));
    }

    public static void main(String[] args) {
        ArrayExample5 obj = new ArrayExample5();
    }
}
