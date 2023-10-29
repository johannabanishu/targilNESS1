package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    private WebElement pic = byXpath("//th[contains(text(),'Pic')]");
    private WebElement title = byXpath("//thead/tr/th[2");
    private WebElement price = byXpath("//thead/tr/th[3] ");
    private WebElement delete = byXpath("//a[contains(text(),'Delete')]");
    private WebElement placeOrder = byXpath("//button[contains(text(),'Place Order')]");
    private WebElement total = byCss("#totalp");
    public void click_delete(){
        delete.click();
    }
    public void click_placeOrder(){
        placeOrder.click();

    }


}
