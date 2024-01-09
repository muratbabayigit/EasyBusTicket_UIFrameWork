package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class userHomePage {


    public userHomePage(){PageFactory.initElements(Driver.getDriver(),this);}


    // Cookies Allow Button
    @FindBy(xpath = "//a[@class='cookies-btn']")
    public WebElement cookiesButton;

    //Home Link on Header












}
