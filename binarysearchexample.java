import java.util.Scanner;

public class binarysearchexample 
{
    void func()
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print("Enter the value: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element: ");
        int sea = sc.nextInt();
        // Process
        int l = 0;
        int u = arr.length - 1;
        int mid, c = 0;
        while (l<=u) 
        {
            mid = (l+u)/2;
            if (arr[mid] == sea || arr[l] == sea || arr[u] == sea) 
            {
                c = 1;
                break;
            }
            else if(arr[mid]>sea)
            {
                u = mid - 1;
            }
            else if(arr[mid]<sea)
            {
                l = mid + 1;
            }   
        }
        if (c==1) 
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found.");
        }
    }
    public static void main(String[] args) 
    {
        binarysearchexample obj = new binarysearchexample();  
        obj.func();  
    }
}
