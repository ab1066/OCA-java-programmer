public class ExceptionListDemo{

    static ExceptionListDemo demo;

    public static void main(String... args){
        // declare variables that should be accessible by all the try, catch and finally blocks
        String name = "chhitij";
        try{
            System.out.println(1/0);
        } catch(Exception e){
            System.out.println(name);
            System.out.println("EXCEPTION OCCURRED");
            System.out.println(e.getMessage());
        } finally{
            System.out.println("EXECUTE NO MATTER WHAT");
        }

    }

}