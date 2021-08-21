import java.util.Scanner;

public class ArrayExample4 {
    ArrayExample4() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        int max = -1, max2 = -1;
        for (int i = 0; i < 5; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            } else if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println("The Second lagest Number in the Array is: " + max2);
    }

    public static void main(String[] args) {
        ArrayExample4 obj = new ArrayExample4();
    }
}
