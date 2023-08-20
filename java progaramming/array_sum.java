import java.util.*;
public class array_sum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element in array");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("the sum of all element in array=" + sum);

    } 
    
}
