import java.util.*;
public class LinearSearch
{
    public static int linearSearchInArray(int arr[],int val)
    {
        int i;
        for (i = 0; i < arr.length; i++) 
        {
            if (arr[i]==val) 
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of Element Store in Array :");
        int num=sc.nextInt();

        int arr[]=new int[num];

        System.out.println("Enter the Element Of given Array :");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=sc.nextInt();   
        }


        System.out.println("Print The Array Element :\n");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");   
        }

        System.out.println("\nEnter the Search Element in Given Array :");
        int val=sc.nextInt();

        

        int res=linearSearchInArray(arr,val);

        if (res==-1) 
        {
            System.out.println(val+" is not found in array");
        }
        else
        {
            System.out.println(val+" is found at "+res+" index");
        }
    }
}
