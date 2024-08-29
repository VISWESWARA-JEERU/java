class Student{
        int rollno;
        String name;
        static String college = "jntua";

        Student(int x,String name){
         rollno = x;
         this.name = name;
        }
      static void change(){
             college = "jntacea";
    } 
     void display(){
            System.out.println(name + " "+ rollno+" "+college);
         }
         
    }
     public class static1{
 public static void main(String[] args) {

     Student s1 = new Student(111,"ram");
     Student s2 = new Student(222,"seeta");
     Student.change();
     s1.display();
     s2.display();

 }
}
