import java.util.*;
class quadratic{

     public static void main(String[] args){
   double root1,root2,real,imaginary;
   double a;
   double b;
   double d;
         try (Scanner scan = new Scanner(System.in)) {
             System.out.println("enter the coffients of x2,x,const");
             a = scan.nextDouble();
             b = scan.nextDouble();
             double c = scan.nextDouble();
             d = (b*b)-(4*a*c);
         }
     if(d>0)
   {
    root1= (-b+(Math.sqrt(d))/(2*a));
    root2= (-b-(Math.sqrt(d))/(2*a));
   System.out.println("root1="+ root1+",root2="+root2);
    }else if(d==0){
      root2 = root1 = -b/(2*a);
    System.out.println("equal roots root1= root2="+root1+root2);
    
    }else{
   real = -b/(2*a);
   imaginary = (Math.sqrt(-d))/(2*a);
 System.out.println("imaginary root1 "+real+imaginary);
 System.out.println("imaginary root2 "+real+-imaginary);
}
}
}

