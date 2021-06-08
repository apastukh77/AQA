package tests;

import logic.Action;
import org.junit.*;



/**
 * @author Serhiy Dubovenko
 */
public class ActionTestUsingJUnit4 {

    @BeforeClass
    public static void installSuite(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void cleanUuSuite(){
        System.out.println("AfterClass");
    }



    @Test
    public void test01_addition_mf(){
        Assert.assertTrue("Addition of a and b not valid", new Action().addition(5,6)==11);
    }

    @Test
    @Ignore
    public void test02_addition_ef(){
        Assert.assertTrue("Addition of a and b not valid", new Action().addition(5,6)==12);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void test03_exception(){
        int[] arr = {1, 2, 3};
        System.out.println(arr[6]);
    }

    @Test (timeout = 1000)
    public void test04_timeout_pass(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test (timeout = 1000)
    public void test05_timeout_failed(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
