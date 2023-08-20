import java.util.*;
public class delete_insert {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element in array=");
            arr[i]=sc.nextInt();
        }
        // delete an element at specific position
        System.out.print("enter the index for delete=");
        int sp=sc.nextInt();
        for(int i=sp;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.println("the array after delete="+arr[i]);
        }
        // insert an element at deleted positiion
        System.out.print("enter the element for insert=");
        int dp=sc.nextInt();
        arr[n-1]=dp;
        for(int i=0;i<n;i++)
        {
            System.out.println("the array :"+arr[i]);
        }
    }
    
}
