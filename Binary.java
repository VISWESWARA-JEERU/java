import java.util.*;
public class Binary {
    static int binarySearch(int arr[],int x,int size){
        int first=0,mid;
        int last = size-1;
         while(first<=last)
          {
             mid = (first+last)/2;
             if(x== arr[mid]){
                System.out.println(mid +" "+arr[mid]);
                return mid;
             }else if(x > arr[mid]){
                 first = mid+1;
                }else {
                    last = mid-1;
                }
          }
         return -1;
    }
    
  public static void main(String[] args){
    int arr[];
    int size,x,i,index;
    try (Scanner obj = new Scanner(System.in)) {
        System.out.println("enter the size of array :");
        size = obj.nextInt();
         arr = new int[size];
        System.out.println("Enter search element:");
        x = obj.nextInt();
        System.out.println("enter the elements of array:");
        for(i=0;i<size;i++){
              arr[i] = obj.nextInt();
   }
        obj.close();
    }
    index = Binary.binarySearch(arr, x, size);
    if(index == -1){
        System.out.println("not found");
    }
    else{
        System.out.println("found"+index);
    }
    
  }


}
