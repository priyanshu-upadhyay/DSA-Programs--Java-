import java.util.Scanner;

public class binarysearch 
{    
    public static void main(String[] args) 
    {
        binarysearch obj = new binarysearch();
        int arr[] = new int[] {1,2,3,4,5,6,15}, ele = 15, f = 0, l = 6, mid;
        while (true) 
        {
            mid = (f+l)/2;
            if (arr[f] == ele || arr[l] == ele || arr[mid] == ele) 
            {
                System.out.println("Element Found");
                break;
            }
            else if (mid == f) 
            {
                System.out.println("Not Found");
                break;
            }
            else
            {
                if(arr[mid]>ele)
                {
                    l = mid;
                }
                else
                {
                    f = mid;
                }
            }
        }
    }    
}