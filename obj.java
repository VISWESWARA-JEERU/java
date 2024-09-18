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
class obj{
   
    public static void main(String[] args) {
        A ob;
        ob = new B();
        
        ob.print();
    }

}