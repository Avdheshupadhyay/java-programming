import java.util.*;
public class transpose_arra {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rows of array=");
        int n=sc.nextInt();
        System.out.print("enter the columb of array=");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
            System.out.println("enter the element in array=");
            arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr [j] [i] +" " );
            }
            System.out.print(" \n");
        }
    }
    
}
