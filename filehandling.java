public class filehandling {
 public static void main(String[] args){
    try{  
          int i = 100/0;
        System.out.println(i);
       
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("array index out of bounds exceptionis handled");
        
    }
    catch(ArithmeticException e){
        System.out.println(e);

    }
    System.out.println("rest of the code is executed");    
 
  try {
    int arr[] =new int[5];
     System.out.println(arr[5]);
  }

 catch(ArithmeticException e){
    System.out.println("Arthimatic exception is handled");
 }

 catch(ArrayIndexOutOfBoundsException e){
    System.out.println("ArrayIndexOutOfBoundsException is happened");
     }
 System.out.println("rest of the code");
}

}