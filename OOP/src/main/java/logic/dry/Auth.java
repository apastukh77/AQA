package logic.dry;

import javax.swing.*;

/**
 * @author Serhiy Dubovenko
 */
public  class Auth {

    /*public String auth(String userName, String password, String token);

    public String auth(String userName, String password);

    public String auth( String token);*/

    public static void main(String[] args) {
        Account myAcc = new Account();
        myAcc.setName("Serhiy").setPassword("Qwerty").setToken("олдж");
    }



    public String auth( Account account){
        return null;
    }
}
