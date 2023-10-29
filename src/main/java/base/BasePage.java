package base;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BasePage extends BaseTest {

    WebDriver driver;

    public  BasePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement byCss(String selector){
      return driver.findElement(By.cssSelector(selector));
    }
    public WebElement byXpath(String selector){
      return driver.findElement(By.xpath(selector));
    }

    public List<WebElement> List_xpath(String selector){
        return driver.findElements(By.xpath(selector));
    }


}
