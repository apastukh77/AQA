package logic.finnaly;

import logic.create_exception.MyException;

import java.io.IOException;

/**
 * @author Serhiy Dubovenko
 */
public class TryFinnally {

    int a = 7;
    int b = 6;

    public void run() throws MyException {
        try{
            if(a<b){
                System.out.println("try without exception");
            }else{
                System.out.println("try with exception");
                throw new MyException();
            }
        }finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args)  {

        try {
            new TryFinnally().run();
        } catch (MyException ex) {
            ex.printStackTrace();
        }

    }


}
