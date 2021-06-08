package tests;

import logic.Action;
import org.hamcrest.core.StringContains;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.AssertJUnit.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Test;

//import static org.testng.AssertJUnit.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;


import static org.testng.Assert.*;



/**
 * @author Serhiy Dubovenko
 */
public class ActionTestUsingTestNG {

    @BeforeTest
    public static void installSuite(){
        System.out.println("BeforeClass");
    }

    @AfterTest
    public static void cleanUpSuite(){
        System.out.println("AfterClass");
    }

    @Test (testName = "addition mf")
    public void test01_addition_mf(){
         assertTrue( new Action().addition(5,6)==11,
                "Addition of a and b not valid");
    }

    @Test
    public void test02_addition_ef(){
       // assertTrue( new Action().addition(5,6)==12, "Addition of a and b not valid");
        assertThat("Фыва ждала олдж", StringContains.containsString("Фыва"));

    }

    @Test
    @ExpectedExceptions(ArrayIndexOutOfBoundsException.class)
    public void test03_exception(){
        int[] arr = {1, 2, 3};
        System.out.println(arr[6]);
    }

    @Test (timeOut = 1000)
    public void test04_timeout_pass(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test (timeOut = 1000)
    public void test05_timeout_failed(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test (expectedExceptions = {ArrayIndexOutOfBoundsException.class})
    public void test06_exception1(){
        int[] arr = {1, 2, 3};
        System.out.println(arr[6]);
    }

}
