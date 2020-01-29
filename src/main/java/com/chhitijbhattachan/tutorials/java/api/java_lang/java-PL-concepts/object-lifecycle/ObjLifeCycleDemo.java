public class ObjLifeCycleDemo{
    public static void main(String... args){

        while(true){
            Money money = new Money();
            money = null;
        }

    }

}

class Money{
    private int amount;
    private String currencyCode;

    public void setAmount(int amt){
        this.amount = amt;
    }

    public void setCurrencyCode(String curCode){
        this.currencyCode = curCode;
    }

    /**
     * constructor
     */
    public Money(){
        super();
        System.out.println("instantiated...");
    }

    /**
     * finalize() method
     */
    @Override
    public void finalize(){
        System.out.println("Finalized...");
    }

    /**
     * hashCode() method
     */

    /**
     * equals() method
     */
    public boolean equals(Money obj){
        if(obj.amount == this.amount){
            return true;
        } else {
            return false;
        }
    }

}