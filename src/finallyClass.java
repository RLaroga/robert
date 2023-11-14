public class finallyClass {



    public static void main( String [] args) {


        returnMethod();
        System.out.println();
    }


    private static void returnMethod() {
        try {
            System.out.println("1");
        }
        catch (Exception e) {

        } finally {
            System.out.println("2");
            return;
        }
    }
}
