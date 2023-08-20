
import java.util.*;
class hero{
    String health;
    String city;
    int age;
public void getinfo()
{
    System.out.println("the information of the hero is given belpow.....");
    System.out.println(this.health);
}
}
public class OOPS1{
public static void main(String args[]){

    hero shivay=new hero();
    shivay.health="best";
    shivay.age=20;
    shivay.city="ujjain";
    //System.out.println(getinfo());
    shivay.getinfo();


}
}