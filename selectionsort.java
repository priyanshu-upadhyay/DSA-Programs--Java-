
import java.util.Scanner;


public class selectionsort {

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
            int min = arr[i];
            int index = i;
            for (int j = i+1; j < n; j++) 
            {
                if (min>arr[j]) 
                {
                    min = arr[j];
                    index = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[index];
            arr[index] = t;          
        }
        System.out.println("\n----Printing Array----\n");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) 
    {
        selectionsort obj = new selectionsort();
        obj.func();

    }
    
}