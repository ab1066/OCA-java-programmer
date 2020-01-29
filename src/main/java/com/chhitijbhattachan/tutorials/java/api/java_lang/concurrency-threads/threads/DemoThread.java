public class DemoThread{
    public static void main(String... args){
        /**
         * starting a thread
         */
        MyThread t1 = new MyThread();
        t1.start();
        Thread t2 = new Thread(new Job());
        t2.start();
        /**
         * joining a thread
         */
        try{
            t1.join();
        }catch(InterruptedException ie){

        }
        /**
         * sleeping a thread
         */
        try{
            t1.sleep(2000); // sleep the thread for 2 seconds
        }catch(InterruptedException ie){

        }
        /**
         * stopping / interrupting the thread
         */
        t1.interrupt();
        /**
         * get state of the thread
         */
        /**
         * set priority of the thread
         */
    }
}

/**
 * create a job for thread overriding the run() method of the thread
 */
class MyThread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.printf("thread %s extending from Thread class is running.%n", Thread.currentThread().getName());
        }
    }
}
/**
 * create a runnable job implementing Runnable Interface and overriding the run() method
 */
class Job implements Runnable{
    @Override
    public void run(){
        System.out.printf("thread %s by implementing Runnable Interface is running.%n", Thread.currentThread().getName());
    }
}