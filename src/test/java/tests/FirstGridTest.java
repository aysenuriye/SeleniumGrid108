package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import static utilities.RemouteDriver.remouteChromeDriver;
import static utilities.RemouteDriver.remouteEdgeDriver;

public class FirstGridTest {


    WebDriver driver;

    @Test

    public void test01(){

        driver= remouteChromeDriver();
        driver.get("https://amazon.com");
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    public void  test02(){


        driver=remouteEdgeDriver();
        driver.get("https://youtube.com");
        System.out.println(driver.getCurrentUrl());

    }






}
