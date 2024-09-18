 class A {
    public void show(){
        System.out.println("hello");
    }
    
}

class B extends A{

    public void print(){
        System.out.println("in B");
    }
}
public class obj{
   
    public static void main(String[] args) {
        B ob;
        ob = new B();
        ob.show();
        ob.print();
    }

}