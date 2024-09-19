
import java.lang.classfile.Superclass;

class Mobiles {
     String color = "blue";
    void ram(){
        System.out.println(color);
     System.out.println("this is super class of Mobiles ");
    }
    
}
class mi extends Mobiles{
  void ram(){
    String color ="white"; //local variable hide a super class variable (WHITE)
    System.out.println(color);
    System.out.println("this is mi mobile \n ram is 6gb ,storage is 128 gb");
  }
}
class features extends mi{
  void special(){
    System.out.println("this is features sub class \n speical method");
  }
}
// class samsung extends Mobiles{
//     void ram(){
//   //  String color = "black"; //local variable hide a super class variable (WHITE)
//    System.out.println(color);
//     System.out.println("this is samsung mobile \n ram is 4gb ,storage is 64 gb");
// }
// }
public class Testinheritence{
    public static void main(String[] args) {
        Mobiles m ;
        //mi ui;
        m = new mi();
        m.ram(); 
        //ui= new features();
        //ui.special();
        //m = new samsung();
        // m.ram(); 
        features fy = new features();
        fy.special();
        fy.ram();
    }
}

