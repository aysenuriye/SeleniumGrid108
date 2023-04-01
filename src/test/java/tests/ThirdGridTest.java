package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static manages.DriverManage.driver;
import static manages.DriverManage.setDriver;

public class ThirdGridTest {

    @Parameters({"browser"})
    @BeforeMethod
    void beforeClass(@Optional("browser") String browser){



        setDriver("grid_edge");
    }
    @Test
    void homepageTesti(){


        driver.get("https://www.youtube.com");
        System.out.println(driver.getCurrentUrl());
    }
}
