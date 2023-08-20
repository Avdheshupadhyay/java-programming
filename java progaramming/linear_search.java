import java.util.*;
public class linear_search {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size odf array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the eelment in arary:");
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the any key :");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("the key is found at index="+ i);
            }
        }
    }
    
}
