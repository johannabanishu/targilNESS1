package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import selenium.BrowserFactory;

public abstract class BaseTest {
    public WebDriver driver;

    @Before
    public  void setUp (){
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.createDriver();
        driver.get("https://www.demoblaze.com");

    }


    @After
    public void coverDown(){
        driver.quit();
    }
}
