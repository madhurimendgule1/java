package com.anthem.made.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by AF11126 on 8/2/2018.
 */
public class MadeRetrySampleTest {
    @Test(retryAnalyzer = MadeRetry.class, timeOut = 20)

    void madeTitleTest() {
        Assert.fail("retrying the tests are failing");
    }
}
