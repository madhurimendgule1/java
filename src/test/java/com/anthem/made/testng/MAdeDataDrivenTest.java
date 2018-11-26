package com.anthem.made.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by AF11126 on 8/2/2018.
 */
public class MAdeDataDrivenTest {
    @Test(dataProvider="empSalary")
    public void processSalary(String empName, int empSal) {
        System.out.println("Employee: " + empName);
        System.out.println("Salary: " + empSal);
    }

    @DataProvider
    public Object[][] empSalary() {
        return new Object[][]{{"John", 15000}, {"Andi", 18000}};
    }
}
