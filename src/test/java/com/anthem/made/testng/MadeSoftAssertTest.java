package com.anthem.made.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by AF11126 on 8/2/2018.
 */
public class MadeSoftAssertTest {
    @Test
    public void softAssertionTest(){
        SoftAssert softAssert= new SoftAssert();

        //Assertion failing
        softAssert.assertEquals(10,20);
        System.out.println("Failing");

        //Assertion passing
        softAssert.assertEquals(1, 1);
        System.out.println("Passing");

        //Assertion passing
        softAssert.assertEquals(1, 1);
        System.out.println("Passing");

        //Assertion failing
        softAssert.assertEquals(0, 1);
        System.out.println("Failing");

        //Assertion passing
        softAssert.assertEquals(1, 1);
        System.out.println("Passing");
        //Collates test results and marks them pass or fail
        softAssert.assertAll();
    }
}
