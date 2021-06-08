package logic.create_exception;

/**
 * @author Serhiy Dubovenko
 */
public class MyException extends Exception{


    public MyException() {
    }

    public MyException(String s) {
        super(s);
    }

    public MyException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public MyException(Throwable throwable) {
        super(throwable);
    }

    public MyException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }

}
