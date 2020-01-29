package exploringHumanTime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.sound.sampled.SourceDataLine;

public class LocalDateDemo{
    public static void main(String ... args){
        try{
            int a[][] = new int[3][];
            a[1] = new int[]{1,2,3};
            a[2] = new int[]{4,5,6};
            System.out.println(a[1][1]);
            String dateTxt = "15-8-2005";
            String datePattern = "d-M-yyyy";
            ZonedDateTime z = ZonedDateTime.now();
            System.out.println(z);
            System.out.printf("the text provided is %s (in the pattern %s) converted to LocalDate is : %s%n", dateTxt, datePattern, LocalDate.parse(dateTxt, DateTimeFormatter.ofPattern(datePattern)));
            System.out.println(DateTimeFormatter.ofPattern(datePattern).format(LocalDate.now()));
            System.out.println(LocalTime.now());
            System.out.println(LocalDateTime.now());
        } catch(DateTimeParseException parse){
            System.out.println("PARSE EXCEPTION GENERATED");
            parse.printStackTrace();
        } catch(DateTimeException e){
            e.printStackTrace();
        }
    }

    public static void periodInstances(){
        //Period period = Period.between(nanuDOB, currentDate); // calculate period between two dates
    }

    public static void createLocalTime(){
        LocalTime currentTime = LocalTime.now(); // current time
        System.out.println(currentTime);
        System.out.printf("%d Hours %d Minutes %d Seconds %d Nanoseconds %n", currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond(), currentTime.getNano());

        LocalTime time1 = LocalTime.parse("10:10:10");
        System.out.println(time1);
    }

    public static void createLocalDate(){
        /**
         * initializing local date
         */
        LocalDate currentDate = LocalDate.now(); // create a local date from current date
        LocalDate dadDOB = LocalDate.of(1200, Month.MAY, 16); // create a local date from year, month and day
        //LocalDate nanuDOB = LocalDate.of(1988, 33, 12);

        /**
         * parse text to local date
         */
        LocalDate parsedFromString = LocalDate.parse("Jan 4, 2019");
    }

    public static void formatDateTime(){
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateWithTime = LocalDateTime.now();
        /**
         * Create instance of DateTimeFormatter
         */
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("mm dd yy");

        System.out.println("current date...");
        System.out.println("in raw form : " + currentDate);
        System.out.println("in basic iso formatted form : " + formatter.format(currentDateWithTime));
    }
}