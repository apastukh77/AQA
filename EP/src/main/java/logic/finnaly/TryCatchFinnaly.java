package logic.finnaly;

import logic.create_exception.MyException;

/**
 * @author Serhiy Dubovenko
 */
public class TryCatchFinnaly {
    int a = 7;
    int b = 6;

    public void run(){
        try{
            if(a<b){
                System.out.println("try without exception");
            }else{
                System.out.println("try with exception");
                throw new MyException();
            }
        }catch (MyException ex){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        new TryCatchFinnaly().run();
    }

}
