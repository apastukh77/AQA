package Shop_33m2.staff;

import Shop_33m2.department.AbstractBaseDepartment;
import Shop_33m2.enums.ConsultResult;
import Shop_33m2.interfaces.DepartmentInterface;
import Shop_33m2.interfaces.VisitorInterface;

public class Consultant extends AbstractBaseEmployee{

    public Consultant() {
    }

    public Consultant (String name){
       super(name);
    }

    @Override
    public void setDepartment(AbstractBaseDepartment abstractBaseDepartment) {

    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);
//here must be logic about customer will buy sth or go home
        return ConsultResult.BUY;
    }

    public void send(){

    }

    public void setDepartment(DepartmentInterface department) {
        super.setDepartment(department);
    }
}
