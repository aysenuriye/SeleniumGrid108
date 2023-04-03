package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class RemouteDriver {

    public static WebDriver driver;//oluşturacağımız remouteWebDriver'i içine atayacağımız Webdriver oluşturduk
    public static  WebDriver remouteChromeDriver(){//Chrome için remouteWebDriver üreten bir method oluşturduk
ChromeOptions chromeOptions=new ChromeOptions();
        try {
            driver= new RemoteWebDriver(new URL("http://192.168.0.32:4444"), chromeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();

        System.out.println("----------------------- RemouteChromeDriver----------------------------");


        return driver;
    }



    public static  WebDriver remouteFirefoxDriver(){//Firefox için remouteWebDriver üreten bir method oluşturduk
        FirefoxOptions firefoxOptions= new FirefoxOptions();
        try {
            driver= new RemoteWebDriver(new URL("http://192.168.0.32:4444"), firefoxOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();
        System.out.println("----------------------- RemouteFirefoxDriver----------------------------");

        return driver;
    }




    public static  WebDriver remouteEdgeDriver(){//Edge için remouteWebDriver üreten bir method oluşturduk


        EdgeOptions edgeOptions=new EdgeOptions();


        try {
            driver= new RemoteWebDriver(new URL( "http://192.168.0.32:4444"), edgeOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();
        System.out.println("----------------------- RemouteEdgeDriver----------------------------");

        return driver;
    }



    public static  WebDriver IEDriver(){//IE için remouteWebDriver üreten bir method oluşturduk
        InternetExplorerOptions internetExplorerOptions=new InternetExplorerOptions();
        try {
            driver= new RemoteWebDriver(new URL("http://192.168.0.32:4444"), internetExplorerOptions);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();

        System.out.println("----------------------- Remoute InternetExplorerDriver----------------------------");
        return driver;
    }
}
