public class wordinterface {
    public static void main(String[] args) {
        Books b = new Books();
         b.bookcost();
    }

}
 class Books implements cost {
    @Override
public void bookcost(){
    System.out.println("name of book is :"+bookname);
    System.out.println("the cost of the book is :"+300+" ruppee only");
}

}
interface cost{
    String bookname="first head in java"; 
  void bookcost();
}
