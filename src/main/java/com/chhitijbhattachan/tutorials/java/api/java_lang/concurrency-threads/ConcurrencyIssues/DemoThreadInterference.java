public class DemoThreadInterference{
    public static void main(String... args){
        // create an object
        DemoThreadInterference obj = new DemoThreadInterference();
        // create two tasks
        Runnable t1 = () -> {
            for(int i = 1; i <= 10; i++){
                obj.increment();
                System.out.println("added : " + obj.value());
            }
        };
        Runnable t2 = () -> {
            for(int i = 1; i <= 10; i++){
                obj.decrement();
                System.out.println("subtracted : " + obj.value());
            }
        };
        // create multiple threads
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        // start the threads
        th1.start();
        th2.start();
    }

    private int counter;

    public synchronized void increment(){
        counter++;
    }

    public synchronized void decrement(){
        counter--;
    }

    public synchronized int value(){
        return counter;
    }
}