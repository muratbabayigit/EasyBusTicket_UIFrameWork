package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class userDashBoard {

    public userDashBoard(){
        PageFactory.initElements(Driver.getDriver(),this);}
}
