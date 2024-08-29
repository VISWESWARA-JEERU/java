public class bike1{
    bike1(){
         System.out.println("bike is created,no parameter");
    }
    bike1(int x ){
      this();
        System.out.println("parametrised constructor"+x);
    }
     void show(){
System.out.println("hello");

     }
   
     public static void main(String[] args){
       bike1 b = new bike1(5); 
       b.show();
       
       
     }
}