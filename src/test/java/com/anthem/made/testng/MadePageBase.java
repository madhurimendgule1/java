package com.anthem.made.testng;

import org.testng.annotations.*;

/**
 * Created by AF11126 on 8/2/2018.
 */
public class MadePageBase {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println(" Before Method ");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method ");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class ");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class ");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test ");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test ");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite ");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite ");
    }
}
