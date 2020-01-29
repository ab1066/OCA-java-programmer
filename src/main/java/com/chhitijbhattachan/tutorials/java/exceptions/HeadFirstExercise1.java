/*
 *          BazEx
 *          FooEx
 *      BiffEx  BarEx
 *      FuckEx  BoinkEx
 *      
 */
public class HeadFirstExercise1{
    public static void main(String... args){
        try{
            int a = Integer.parseInt(args[0]);
            switch (a){
                case 1:
                    throw new BazEx();
                case 2:
                    throw new FooEx();
                case 3:
                    throw new BiffEx();
                case 4:
                    throw new BarEx();
                case 5:
                    throw new BoinkEx();
                case 6:
                    throw new FuckEx();
            }
        }catch(FuckEx fo){
            System.out.println("FuckEx Caught");
        }catch(BoinkEx eo){
            System.out.println("BoinkEx Caught");
        }catch(BiffEx ei){
            System.out.println("BiffEx Caught");
        }catch(BarEx eb){
            System.out.println("BarEx Caught");
        }catch(FooEx ef){
            System.out.println("FooEx Caught");
        }catch(BazEx ex){
            System.out.println("BazEx Caught");
        }catch(Exception e){
            System.out.println("Generic Exception Caught");
        }
    }
}

class BazEx extends Exception{

}

class FooEx extends BazEx{

}

class BiffEx extends FooEx{

}

class BarEx extends FooEx{

}

class BoinkEx extends BarEx{
}

class FuckEx extends BiffEx{
}