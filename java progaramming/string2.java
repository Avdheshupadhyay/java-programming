import java.util.*;
public class frequency_element {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=1;
        for(int i=0;i<n;i++)
        {
            System.out.print("enter the element in array=");
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
        
            for(int i=j+1;i<n;i++)
            {
                if(arr[j]==arr[i])
                {
                    count++;
                }
            }
            System.out.println(count);
        }
        
    }
}
