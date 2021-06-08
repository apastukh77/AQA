package education_online2;

public class MyClass {

    private int a;
    private double E;

    MyClass(){
        this.E = 2.72;
    }//optional empty constructor

    public double getExp(){
        return this.E;
    }


    public int pow (int a){
        int result = a*a;
        return result;
    }

    public int powl (int a, int n){
        int res2 = a;
         for (int i = 1; i <= n; i++) res2 *= a ;
         return res2;

         }

    }

