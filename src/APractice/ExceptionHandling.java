package APractice;

public class ExceptionHandling {
    public static void main (String [] args){
        /*
        try{
            System.out.println("Before throw");
            throw new ArithmeticException();
        }
        catch (ArithmeticException ex){
            System.out.println(ex);
        }*/

        //Example 2

        int [] nums = new int [5];
        try {
            System.out.println("In try");
            nums[10] = 25;
        }
        catch (Exception ex){
            System.out.println("In exception");
            return;
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
