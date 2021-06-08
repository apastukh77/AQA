package Shop_33m2.bank;

public class SberBank extends AbstractBaseBank {


    //all child classes have to have a constructor if it has in the parent class
    public SberBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void giveCredit() {
        super.giveCredit();
    }

    @Override
    public String getInfo() {
        return null; //abstract method is needed in child classes
    }

    //overload method of checkInfo
    public void checkInfo(boolean critical){
        System.out.println("Critical requests");
    }
}
