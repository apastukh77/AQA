package Shop_33m2.department;

import Shop_33m2.goods.Televisor;
import Shop_33m2.interfaces.DepartmentInterface;
import Shop_33m2.interfaces.EmployeeInterface;
import Shop_33m2.interfaces.GoodsInterface;

import java.util.ArrayList;

  public abstract class AbstractBaseDepartment implements DepartmentInterface {

    public AbstractBaseDepartment() {
    }

    public AbstractBaseDepartment(String name) {
      this.name = name;
    }

    private String name;
    private ArrayList<EmployeeInterface> employeeList = new ArrayList<EmployeeInterface>();
    private ArrayList<GoodsInterface> goodsList = new ArrayList<GoodsInterface>();


    @Override
    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList(){return employeeList;}
    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList){this.employeeList=employeeList;}

    @Override
    public ArrayList<GoodsInterface> getGoodsList(){return goodsList;}
    public void setGoodsList(ArrayList<GoodsInterface> goodsList){this.goodsList=goodsList;}

    public void addEmployee(EmployeeInterface employee){
      employee.setDepartment(this);
      employeeList.add(employee);
    }


//    public void addGoods(GoodsInterface goods){
//      goods.setDepartment(this);//by adding goods it will be set department automatically
//      goodsList.add(goods);
//    }

}
