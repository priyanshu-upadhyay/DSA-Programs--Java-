/**
 * bubblesort
 */
import java.util.Scanner;
public class bubblesort 
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("\n----Inputing Array----\n");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) 
        {
            for (int j = 0; j < n-1; j++) 
            {
                if (arr[j]>arr[j+1]) 
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("\n----Printing Array----\n");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) 
    {
        bubblesort obj = new bubblesort();
        obj.func();
    }
    
}