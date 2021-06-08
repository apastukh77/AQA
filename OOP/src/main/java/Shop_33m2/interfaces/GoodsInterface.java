package Shop_33m2.interfaces;

public interface GoodsInterface {

    double getPrice();
    boolean hasGuarantee();

    String getName();
    DepartmentInterface getDepartment();
    String getCompany();

}
