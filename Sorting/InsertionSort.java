import java.util.Scanner;

public class InsertionSort 
{
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");    
        }
        System.out.println();
    }

    public static void insertionSortArray(int arr[])
    {
        for (int i = 1; i < arr.length; i++) 
        {
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 &&  arr[prev]>curr) 
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of element store in the array :");
        int num=sc.nextInt();

        int arr[]=new int[num];

        System.out.println("Enter the Array Element : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();    
        }

        System.out.println("\nPrint Array Before Sorting : ");
        printArray(arr);
        
        insertionSortArray(arr);

        System.out.println("\nPrint Array After Sorting : ");
        printArray(arr);
    }    
}
