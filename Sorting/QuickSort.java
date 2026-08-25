import java.util.Scanner;

public class QuickSort 
{
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");    
        }
        System.out.println();
    }

    public static void quickSortArray(int arr[],int si,int ei)
    {
        if (si>=ei) 
        {
            return;    
        }

        int pIdx=particianArray(arr,si,ei);
        quickSortArray(arr, si, pIdx-1);
        quickSortArray(arr, pIdx+1, ei);

    }

    public static int particianArray(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;

        for (int j = si; j <ei; j++) 
        {
            if (arr[j]<pivot) 
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;    
            }
        }
        i++;
        int temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the Number of Element Store in the array : ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter The Array Element : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("\nBefore Sorting Print The Array : ");
        printArray(arr);

        quickSortArray(arr, 0, n-1);

        System.out.println("After Sorting Print The Array : ");
        printArray(arr);



    }    
}
