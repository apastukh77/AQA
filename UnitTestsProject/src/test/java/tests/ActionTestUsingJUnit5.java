package tests;

import logic.Action;
import org.junit.jupiter.api.*;


import static org.testng.Assert.assertTrue;

/**
 * @author Serhiy Dubovenko
 */
public class ActionTestUsingJUnit5 {

    @BeforeAll
    public static void installSuite(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void cleanUpSuite(){
        System.out.println("AfterAll");
    }

    @Test
    @DisplayName("My test for checking addition a and b main flow")
    public void test01_addition_mf(){
        assertTrue( new Action().addition(5,6)==11,
                "Addition of a and b not valid");
    }

    @Test
    @Disabled
    public void test02_addition_ef(){
        assertTrue( new Action().addition(5,6)==12, "Addition of a and b not valid");
    }

    @Test
    public void test03_exception(){
        int[] arr = {1, 2, 3};
        System.out.println(arr[6]);
    }

    @Test
    @Timeout(1000)
    public void test04_timeout_pass(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Timeout(1000)
    public void test05_timeout_failed(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test06_exception1(){
        
        int[] arr = {1, 2, 3};
        System.out.println(arr[6]);
    }

}
