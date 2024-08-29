class College{
   public int rollno;
   public String name;
   public String branch;
   public static String college = "JNTUA";
    
   College(int rollno,String name,String branch){
    this.rollno = rollno;
    this.name = name;
    this.branch = branch;
   }
  public void studentDetails(){
     System.out.println("name is: "+name+"\n"+"Branch: "+branch+"\n"+"Roll.no: "+rollno+"\nCollege: "+college);
   }
  
  }

public class Student{
     public static void main(String[] args) {
         
     
   College s1 = new College(535,"visweswara","CSE");
   College s2  = new College(532,"mythresh","CSE");
   
    s1.studentDetails();
    s2.studentDetails();

     }
   
}