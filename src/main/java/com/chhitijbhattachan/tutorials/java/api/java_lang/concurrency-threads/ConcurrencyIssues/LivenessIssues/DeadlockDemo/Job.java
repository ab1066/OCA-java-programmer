
public class Job implements Runnable{

    private BankAccount account = new BankAccount();

    public static void main(String... args){
        Job theJob = new Job(); // create a new job
        Thread t1 = new Thread(theJob);
        Thread t2 = new Thread(theJob);
        t1.setName("Ryan");
        t2.setName("Monica");
        t1.start();
        t2.start();
    }

    @Override
    public void run(){
        for (int x = 0; x < 10; x++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
            System.out.println("Overdrawn!"); }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep"); Thread.sleep(500);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " woke up.");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
        } else {
            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
        }
    }

}