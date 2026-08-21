import java.util.*;
public class BubbleSort 
{
    public static void bubbleSortArray(int arr[],int num)
    {
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = 0; j < arr.length-i-1; j++) 
            {
                if (arr[j]>arr[j+1]) 
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;    
                }
            }
        }
    } 

    public static void printArray(int arr[],int num)
    {
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element store in the array ");
        int num=sc.nextInt();

        int arr[]=new int[num];

        System.out.println("Enter the Array Element :");
        
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Before Sort Print Array : ");
        printArray(arr,num);
        bubbleSortArray(arr,num);
        System.out.println("After Sort Print Array : ");
        printArray(arr,num);
    }    
}