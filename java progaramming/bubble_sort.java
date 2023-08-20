import java.util.*;
public class bubble_sort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp;
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element in array:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                     temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("the sorted array is="+ arr[i]);
        }

    }
    
}
