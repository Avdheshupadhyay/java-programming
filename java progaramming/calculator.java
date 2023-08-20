
import java.util.Scanner;
public class calculator {

    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
            System.out.println("enter the first number:");
            int num1=sc.nextInt();
            System.out.println("enter the second number:");
            int num2=sc.nextInt();
            System.out.println("enter the any operator:");
            String ope=sc.nextLine();
            if (ope==("plus"))
            {
                System.out.println(num1+num2);
            }
          else if(ope=="minus")
          {
            System.out.println(num1-num2);
          }
          else if(ope=="multiply")
          {
            System.out.println(num1*num2);
          }
          else if(ope=="divide")
          {
            System.out.println(num1/num2);
          }
          else{
            System.out.println("something went wrong");
          }

            
    }

   
  
    }
    

