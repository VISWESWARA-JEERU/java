public class filehandling2 {
    
    public static void main(String[] args) {
        try {
            String s =null;
            System.out.println(s.length());
        }catch(ArithmeticException e){
            System.out.println("this is arthemtic exception ");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds Exception");

        }         catch (Exception e) {
            System.out.println(e);
            System.out.println("parent exception occurs ");
        }finally{
            System.out.println("runtime error is handled ");
        }
    }
}
