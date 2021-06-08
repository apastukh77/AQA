package Shop_33m2.goods;

import Shop_33m2.interfaces.DepartmentInterface;
import Shop_33m2.interfaces.GoodsInterface;

public abstract class AbstractBaseGoods implements GoodsInterface {

    public static final int DEFAULT_GUARANTEE = 2;
    //without static it would be this variable needs to create in each child class


    public AbstractBaseGoods() {
    }

    public AbstractBaseGoods(String name) {
        this.name = name;
    }

    public AbstractBaseGoods(double price, boolean hasGuarantee, DepartmentInterface department, String company) {
        this.price = price;
        this.hasGuarantee = hasGuarantee;
        this.department = department;
        this.company = company;
    }

    //the properties that will be had all the goods
    private double price;
    private boolean hasGuarantee;
    private String name;
    private DepartmentInterface department;
    private String company;


    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee){
        this.hasGuarantee=hasGuarantee;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }
    public void setDepartment(DepartmentInterface department) {
        this.department=department;
    }

    @Override
    public String getCompany() {
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
}
