package Shop_33m2.bank;

import Shop_33m2.interfaces.BankInterface;

public abstract class AbstractBaseBank implements BankInterface {
    //quantity of requests
    public static int requestCount;

    //abstract class can have constructor
    public AbstractBaseBank(String name, String creditDescription) {
        this.name = name;
        this.creditDescription = creditDescription;
    }

    private String name;
    private String creditDescription;

    public abstract String getInfo();//abstract method is needed in child classes

    @Override
    public void checkInfo(){
            requestCount++;
    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }


}
