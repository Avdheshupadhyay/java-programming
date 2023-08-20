import java.util.*;
public class sum_diagonal {
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
                System.out.print("enter the element in 2D arry=");
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                   // sum=(sum+arr[i])+arr[j];
                   System.out.println(   arr[i] [j]);

                }
            }
        }
        //System.out.print("the sum of diagonal is ="+sum);
        
    }
    
}
