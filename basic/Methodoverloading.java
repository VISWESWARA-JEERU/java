

public class Methodoverloading {
   
  static  void add(int x,int y){
    System.out.println("interger addition is :"+(x+y));
     }
     static void add(double x,double y){
        System.out.println("float addition is :"+(x+y));
    } 
    
    static void  add(String str1,String str2 ){
        System.out.println("string addition is :"+(str1+str2));
    }
    static void add(int ...x){
        int count=0;
        for(int i:x){
            count = count+i;
         }
    System.out.println("addtion is :"+count);
    }
   
  public static void main(String[] args) {
    Methodoverloading.add(66,99);
    Methodoverloading.add(56.4,99.99);
    Methodoverloading.add("hello","world");
    Methodoverloading.add(535,34,366,35643);
} 
}

