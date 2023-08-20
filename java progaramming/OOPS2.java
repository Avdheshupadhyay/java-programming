import java.util.*;
class Watch{
    String brand;
    int price;
    String type;
    public void info(){
        System.out.println(this.brand);
      

    }
    Watch(String brand,int price,String type ){
        this.brand=brand;
        this.price=price;
        this.type=type;



    }


}
public class oops2 {
    public static void main(String args[]){
    Watch.titan=new Watch("titan",5000,"digital");
    System.out.println(titan.info());
}
}
