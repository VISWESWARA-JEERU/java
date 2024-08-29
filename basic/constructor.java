public class constructor {
 
    public static void main(String[] args) {
        Book b1 = new Book();
       System.out.println("Book name is :"+b1.name); 
       System.out.println("Book name is :"+b1.cost); 
       System.out.println("Book name is :"+b1.author); 
    }
 
static class Book{
    String name;
    String author;
    double cost;

    Book(){
        name = "java programming";
        cost = 500.00;
        author = "Kathy Sierra";
    }
}

}

