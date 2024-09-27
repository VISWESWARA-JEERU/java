public class Testpolymorphism{
    public static void main(String[] args) {
      Books b;
      b = new mathbooks("Discrete Mathamatics ");  
      b.information();
      System.out.println("this cost is in superclass "+b.cost);
      b = new physics("thaygaraja");
      b.information();
      b = new language("head in first java");
      b.information();
    }
}
class Books{
    double cost = 50;
    void information(){
        System.out.println("this is super  class\n ");
    }
}
class mathbooks extends Books{
    String bname;
    double cost = 100.44;
    mathbooks(String name){
       bname = name;
    }
     @Override
    void information(){
        
        System.out.println("this is mathsbooks class\n");
        System.out.println("name of the book is :"+bname);
        System.out.println("cost of the book is :"+cost);
    }

}
class physics extends Books {
    String bname;
    double cost = 145.44;
    physics(String name){
        bname = name;

    }
    @Override
    void information(){
        System.out.println("this is physics  class\n");
        System.out.println("name of the book is :"+bname);
        System.out.println("cost of the book is :"+cost);
    }
    
}
class language extends Books{
    String bname ;
    double cost = 456.44;
    language(String name){
        bname = name;

 }@Override
 void information(){
    System.out.println("this is language class\n");
    System.out.println("name of the book is :"+bname);
    System.out.println("cost of the book is :"+cost);
}
}