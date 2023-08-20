import java.util.*;
public class duplicate_element {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the size of array=");
    int n=sc.nextInt();
    int arr[]=new int[n];
    char k='a';
    for(int i=0;i<n;i++)
    {
        System.out.print("enter the element in array:");
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                arr[i]=k;
            }
            
        }
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=k)
        {
        System.out.println(arr[i]);
        }
    }
}
}
