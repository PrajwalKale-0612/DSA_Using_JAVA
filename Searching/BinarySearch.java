import java.util.*;

public class BinarySearch {
    public static int binarySearchArray(int sval, int arr[]) 
    {
        int low=0;
        int high=arr.length-1;

        int mid=0;

        while (low<=high) 
        {
            mid=low+(high-low)/2;
            if (arr[mid]==sval) 
            {
                return mid;
            }
            else if (arr[mid]>sval) 
            {
                high=mid-1;
            }   
            else
            {
                low=mid+1;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The number How Many Element Store in Array :");
        int num = sc.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the Array Element with Sorted Order : ");

        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }


        System.out.println("Print Array Element :");

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }


        System.out.println("\nEnter The number Who Search in Array:");
        int sval = sc.nextInt();

        int res=binarySearchArray(sval,arr);

        if (res==-1) 
        {
            System.out.println(sval+" is not found in array");
        }
        else
        {
            System.out.println(sval+" is found at "+res+" index");
        }
        
    }
}
