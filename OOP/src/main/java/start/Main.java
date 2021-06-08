package start;

import Shop_33m2.SalesRoom;
import Shop_33m2.bank.SberBank;
import Shop_33m2.client.CommonVisitor;
import Shop_33m2.client.VipVisitor;
import Shop_33m2.department.ElectronicDepartment;
import Shop_33m2.department.GameDepartment;
import Shop_33m2.enums.ConsultResult;
import Shop_33m2.goods.Computer;
import Shop_33m2.goods.GameConsole;
import Shop_33m2.goods.Subwoofer;
import Shop_33m2.goods.Televisor;
import Shop_33m2.interfaces.GoodsInterface;
import Shop_33m2.staff.Administrator;
import Shop_33m2.staff.Consultant;

public class Main {
    public static void main(String[] args) {imitateShopWorking();}
        private static void imitateShopWorking(){

        GoodsInterface goods = new Televisor (1000, false, "SmartTV", "Samsung");
        //Приведение типов (cast)
        Televisor t = (Televisor) goods;
        t.selectChannel();

        GoodsInterface goods2 = new Subwoofer("Microlab");
        GoodsInterface goods3 = new Computer (200, true, "Zenbook", "McBook", 2048);
        GoodsInterface goods4 = new Computer (200, true, "Zenbook", "Asus", 2048);

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(goods);
        commonVisitor.buy(goods2);
        commonVisitor.buy(goods3);
        commonVisitor.buy(goods4);


        SberBank sberBank = new SberBank("Sberbank", "Kopilka");
        sberBank.checkInfo();
        sberBank.checkInfo();

        System.out.println("SberBank requestCount = " + SberBank.requestCount);


        System.out.println("=================================================");

        SalesRoom salesRoom = new SalesRoom();//Create a sales room

            Administrator administrator = new Administrator(salesRoom);
            //create administrator of entire sales room

            ElectronicDepartment electronicDepartment = new ElectronicDepartment();
            GameDepartment gameDepartment = new GameDepartment();
            //create two department in sales room

            salesRoom.addDepartment(electronicDepartment);
            salesRoom.addDepartment(gameDepartment);
            //add departments in sales room

            //add employees in departments
            Consultant consultant1 = new Consultant("Jhon");
            consultant1.setFree(true);

            Consultant consultant2 = new Consultant("Ann");

            electronicDepartment.addEmployee(consultant1);
            gameDepartment.addEmployee(consultant2);

            //create goods
            Computer computer = new Computer(200, true, "Zenbook", "Asus", 2048);
            Televisor televisor = new Televisor(1000, false, "SmartTV", "Samsung");
            GameConsole gameConsole = new GameConsole("XBOX", 1024);


//            //add goods has been created
//            electronicDepartment.addGoods(televisor);
//            electronicDepartment.addGoods(computer);
//            gameDepartment.addGoods(xbox);

            //Create customers
            CommonVisitor visitor1 = new CommonVisitor();
            VipVisitor vipVisitor1 = new VipVisitor( 50);

            //find free consultant from department
            ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(visitor1);

            switch (consultResult){
                case BUY:
                    visitor1.buy(televisor);
                    break;
                case EXIT:
                    break;
            }
    }
}
