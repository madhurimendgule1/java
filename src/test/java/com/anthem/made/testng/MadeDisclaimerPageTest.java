package com.anthem.made.testng;

import org.testng.annotations.*;

/**
 * Created by AF11126 on 8/1/2018.
 */
public class MadeDisclaimerPageTest extends MadePageBase {

    @Test
    public void seeDisclaimerTitle() {
        System.out.println("This is seeDisclaimerTitle");
    }

    @Test
    public void seeBrandOnDisclaimer() {
        System.out.println("This is myseeBrandOnDisclaimer");
    }

    @Test
    public void seeDisclaimerText() {
        System.out.println("This is seeDisclaimerText");
    }
}
