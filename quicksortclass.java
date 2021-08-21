
import java.util.Scanner;


public class quicksortclass {


    public static int position(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        do 
        {
            while (pivot >= arr[i]) {
                i++;
            }
            while (pivot < arr[j]) {
                j--;
            }
            if( i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        } while (i<j);

        arr[low] = arr[j];
        arr[j] = pivot;

        return j;
    }
    public static void printarray(int arr[], int n)
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[], int low, int high)
    {
        if (low<high) 
        {
            int postionpivot = position(arr, low, high);
            quicksort(arr, low, postionpivot-1);     //  Left Side
            quicksort(arr, postionpivot+1, high);    //  Right Side
        }
        

    }
    

    public static void main(String[] args) 
    {
        int arr[] = {4,5,6,1,-1,9};
        int n = 6;
        System.out.println("\n-------Before Sorting-------\n");
        printarray(arr, n);
        quicksort(arr, 0, n-1);
        System.out.println("\n-------After Sorting-------\n");
        printarray(arr, n);


    }
    
}