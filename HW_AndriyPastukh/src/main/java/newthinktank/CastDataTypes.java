package newthinktank;

public class CastDataTypes {
    public static void main(String[] args) {

        int smInt = 10;
        long smLong = smInt;
        System.out.println(smLong);

        double cDbl = 1.234;
        int cInt = (int)cDbl;
        System.out.println(cInt);

        long bigLong = 2674389289L;
        int bInt = (int)bigLong;
        System.out.println(bInt);

        String fNam = Double.toString(1.678);
        System.out.println(fNam);

        int strInt = Integer.parseInt("10");
        System.out.println(strInt);


    }


}
