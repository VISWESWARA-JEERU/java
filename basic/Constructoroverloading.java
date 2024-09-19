

public class Constructoroverloading{
 public static void main(String[] args) { 
   a obj =new a(535);
   a obj1= new a();
   System.out.println("constructor overloading is :"+obj.rollno);
   System.out.println("constructor overloading is :"+obj1.rollno);
   //System.out.println("constructor overloading is :"+obj.name);
   // the name cannot be acces ? is not an instance variable
 }

}
class a{
    int rollno;
    a(){
        String name = "viswa";
       System.out.println(name);
  }
  a(int x){

    rollno = x;
   // System.out.println(rollno);
  }
  a(String k){
   String  branch = k;
   System.out.println(branch);
  }

}
