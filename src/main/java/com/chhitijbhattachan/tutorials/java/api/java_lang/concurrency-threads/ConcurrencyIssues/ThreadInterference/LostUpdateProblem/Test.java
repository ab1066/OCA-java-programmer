public class Test{
    public static void main (String[] args) {
        Job job = new Job();

        // #NOTE: The two threads are Sharing the same job
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.setName("ryan");
        b.setName("monica");
        a.start();
        b.start();
    }
}