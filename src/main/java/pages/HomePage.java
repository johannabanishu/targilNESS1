package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {


    private WebElement logo = byCss("a.navbar-brand");
    private WebElement phones = byXpath("//a[text()='Phones']");
    private WebElement laptops = byXpath("//a[text()='Laptops']");
    private WebElement monitors = byXpath("//a[text()='Monitors']");

    private List<WebElement> list_monitors = List_xpath("//*[@class = 'card-title']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getList_monitors() {
        return list_monitors;
    }

    public void click_logo(){
        logo.click();
    }
    public void click_phones(){
        phones.click();
    }
    public void click_laptops(){
        laptops.click();
    }
    public void click_monitors(){
        monitors.click();
    }

    public List<String> cat_monitors(){
        List<String> monitors = new ArrayList<>();
        monitors.add("Apple monitor 24");
        monitors.add("ASUS Full HD");
        return monitors;
    }

    public List<String> getTextFromLists(List<WebElement> elements){
        List<String> element_text = new ArrayList<>();
        for (int x=0; x<elements.size(); x++){
            element_text.add(elements.get(x).getText());
        }
        return element_text;
    }






}
