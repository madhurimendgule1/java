package com.anthem.made.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by AF11126 on 8/2/2018.
 */
public class MadeRetry implements IRetryAnalyzer{
    private int retryCount = 0;
    private static final int maxRetryCount = 3;

    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;

    }
}
