package tests;


import org.testng.annotations.*;

import static manages.DriverManage.*;

public class SecondGridTest {



    @Parameters("browser")
    @BeforeMethod
    void beforeClass(@Optional("browser") String browser) {
        setDriver("grid_chrome");
    }

    @Test
    void homePage() {

        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @AfterMethod
    void afterClass() {
          closeDriver();
    }
}
