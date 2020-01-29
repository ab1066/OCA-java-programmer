import java.io.FileNotFoundException;
import java.io.IOException;

public class ChainedExceptionDemo{

    public static void initCauseDemo() throws Throwable {
        try{
            throw new IOException();
        }catch(IOException ex){
            Throwable newEx = new FileNotFoundException();
            newEx.initCause(ex);
            throw newEx;
        }
    }

    public static void newThrowableWithDoubleParams() throws Throwable{
        try{
            throw new IOException();
        }catch(IOException ex){
            Throwable newEx = new Throwable("io exception", ex);
            throw newEx;
        }
    }

    public static void throwableConstructorSingleParam() throws Throwable{
        try{
            throw new IOException();
        }catch(IOException ex){
            throw new Throwable(ex);
        }
    }

    public static void a(){
        // new Exception().getCause();
        // new Exception("", new Throwable());
        // new Exception(new Throwable()) -> INVALID with Exception Class
    }
    public static void main(String ... args){
        try{
            throwableConstructorSingleParam();
        }catch(Throwable t){
            t.getCause().printStackTrace();
            System.out.println(t.getMessage());
        }
    }
}