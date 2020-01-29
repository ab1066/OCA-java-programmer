import java.time.*;

public class InstantDemo{
    public static void main(String [] args){
        Instant newInstant = Instant.now();
        System.out.println(newInstant.toString());
        System.out.println(newInstant.getNano());
    }
}