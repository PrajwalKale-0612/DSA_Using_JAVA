import java.util.*;
public class SelectionSort 
{
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSortArray(int arr[])
    {
        for (int i = 0; i<arr.length; i++) 
        {
            int small=i;
            for (int j = i+1; j < arr.length; j++) 
            {
                if (arr[small]>arr[j]) 
                {
                    small=j;    
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }

    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Size of Array :");
        int num=sc.nextInt();

        int arr[]=new int[num];

        System.out.println("Enter the Array Element :");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();  
        }

        System.out.println("\nPrint Array Before the Sorting : ");
        printArray(arr);

        selectionSortArray(arr);

        System.out.println("Print Array After the Sorting : ");
        printArray(arr);



        
    }    
}
