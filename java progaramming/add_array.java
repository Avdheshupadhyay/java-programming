import java.util.*;
public class add_array {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
      System.out.println("enter the array of size=");
      int n=sc.nextInt();
       int arr[]= new int[n];
       for(int i=0;i<n;i++)
       {
        System.out.print("enter the element of array=");
         arr[i]=sc.nextInt();
       }
       
    }
}
