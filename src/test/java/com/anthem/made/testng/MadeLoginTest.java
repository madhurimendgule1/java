package com.anthem.made.testng;

import org.testng.annotations.*;

/**
 * Created by AF11126 on 8/1/2018.
 */
public class MadeLoginTest extends MadePageBase {



    @Test(enabled = true)
    public void madeLoginUserName() {
        System.out.println("This is my madeLoginUserName");
    }

    @Test
    @Parameters("sampleParamName")
    public void MadeLoginPassword(String param) {
        System.out.println("This is my MadeLoginPassword");
        System.out.println("This is my parameter value: "+param);

    }

    @Test
    public void MadeClickLogon() {
        System.out.println("This is MadeClickLogon");
    }
}
