public class DemoInnerClass{

    /**
     * Parent Instance Members
     */
    public void parentGreet(){
        new InnerClass().greet();
        new InnerClass().sing();
    }
    private void parentSign(){

    }
    /**
     * Parent Class Members
     */
    public void parentStaticGreet(){

    }
    private void parentStaticSing(){

    }

    private class InnerClass{
        /**
         * Child Instance Members
         */
        public void greet(){

        }
        private void sing(){

        }
    }

    public static void main(String [] args){

    }
}