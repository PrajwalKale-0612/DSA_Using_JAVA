import java.util.Scanner;

public class CountSort 
{
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");    
        }
        System.out.println();
    }
    
    public static void countSortArray(int arr[])
    {
        int largest=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) 
        {
            if (largest<arr[i]) 
            {
                largest=arr[i];    
            }
        }

        int count[]=new int[largest+1];

        for (int i = 0; i < arr.length; i++) 
        {
            count[arr[i]]++;
        }

        int j=0;
        for (int i = 0; i < count.length; i++) 
        {
            while (count[i]>0) 
            {
                arr[j]=i;
                j++;
                count[i]--;    
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Number of Array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the Array Element : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("\nBefore Sorting Print Array : ");
        printArray(arr);
        
        countSortArray(arr);
        
        System.out.println("After Sorting Print Array : ");
        printArray(arr);
    }    
}
