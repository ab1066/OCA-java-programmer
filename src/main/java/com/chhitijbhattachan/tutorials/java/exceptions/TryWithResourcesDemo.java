import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourcesDemo{
    public static void main(String ... args) throws FileNotFoundException, IOException{
        testTryCatchFinally();
    }

    static void testTryCatchFinally(){
        try{
            int i = 1/0;
        }catch(ArithmeticException ex){
            System.out.println("catch executed");
        }finally{
            System.out.println("finally executed");
        }
    }

    static int readFirstLineFromFileWithFinallyBlock(String path) throws IOException {
        InputStream in = null;
        try {
            return 1/0;
        } finally {
            in.close();
        }
    }
    static int readFirstLineFromFile(String path) throws IOException {
        try (BufferedReader br = null;) {
            return 1/0;
        }
    }
}