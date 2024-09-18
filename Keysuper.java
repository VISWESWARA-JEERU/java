 class Animal{
    String color = "blue";
    void eat(){
        System.out.println("\nAnimal is eating...(super class)");
        System.out.println(2+4);
    }
    Animal(){
        System.out.println("this is constructor of animal");
            }
         }
 

class Dog extends Animal{
    String color = "brown";
    Dog(int x){
        super();
        System.out.println("the double of number is in DOG CONSTRUCTOR of int type :"+(x+x));
    }
    void eat(){
        System.out.println("\n Dog is eating.... (subclass)");
        System.out.println(10+10);
    }
  void bark(){
    System.out.println("\nDog is barking....");
 }
    public  void display(){
    System.out.println("without super keyworld  color is :"+color);
      System.out.println("withsuper keyword color is :"+super.color);
     eat();
     super.eat();
    }
      
}
class Keysuper{
    static int x=50;
    public static void main(String[] args ){
      Dog d = new Dog(x);
      d.display();
      d.bark();
       }
}