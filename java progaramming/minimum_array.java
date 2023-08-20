import java.util.*;
public class minimum_array {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array=");
        int n=sc.nextInt();
        int temp;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element in array:");
            arr[i]=sc.nextInt();
        }
        int mini=arr[0];
        for(int i=0;i<n;i++)
        {
            if(mini>arr[i])
            {
                temp=arr[i];
                arr[i]=mini;
                mini=temp;
            }
        }
        System.out.print("the minimum element is =" +mini);
    }
}
