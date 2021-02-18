package com.cybertek.utilities;

public class BrowserUtils {



    /*
    Method to assert title
     */
    public static boolean titleVerification(String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();
       // Assert.assertTrue(expectedTitle.equals(actualTitle));

        return actualTitle.equals(expectedTitle);

    }





    //create method name: wait
    //converting milliseconds to seconds
    //handle checked exception

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

}
