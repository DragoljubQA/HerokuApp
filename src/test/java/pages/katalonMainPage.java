package pages;

import base.baseKatalon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class katalonMainPage extends baseKatalon {

    public katalonMainPage() { PageFactory.initElements(driver, this);}

    public @FindBy(css = ".page_item.page-item-10")
    WebElement MyAccountButton;

    //button product_type_simple add_to_cart_button ajax_add_to_cart
    public @FindBy(css = ".product.type-product.post-54.status-publish.first.instock.product_cat-posters.has-post-thumbnail.sale.taxable.shipping-taxable.purchasable.product-type-simple")
    WebElement FirstObjectMain;
    public @FindBy(css = ".product_title.entry-title")
    WebElement FirstObjectName;
    public @FindBy(name = "add-to-cart")
    WebElement AddToCartFirstObject;
    public @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a")
    WebElement FirstObjectCartName;


    public @FindBy(css = ".page_item.page-item-8")
    WebElement CartButton;

    public void clickMyAccountButton() {MyAccountButton.click();}
    public void clickOnFirstObject() {FirstObjectMain.click();}
    public void clickCartButton() {CartButton.click();}
    public void addToCartFirstObject() {AddToCartFirstObject.click();}

    public WebElement getFirstObjectName() {
        return FirstObjectName;
    }

    public WebElement getFirstObjectCartName() {
        return FirstObjectCartName;
    }
}
