import java.util.*;
public class array1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       int arr[]=new int[8];
        int i;
        for(i=0;i<8;i++)
        {
            System.out.println("enter the element in array=");
           arr[i]=sc.nextInt();
         }
         for(i=0;i<8;i++)
         {
            System.out.println("the array is"+arr[i]);
         }

    }
}
