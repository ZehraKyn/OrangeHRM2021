package com.OrangeHrm.pages;

import com.OrangeHrm.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.OrangeHrm.base.BasePage.driver;

public class LoginPage {

    @FindBy(id = "txtUsername")
    private static WebElement userName;

    @FindBy(id = "txtPassword")
    private static WebElement password;

    @FindBy(id = "btnLogin")
    private static WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/h1")
    private static WebElement homePage;

    @FindBy(id = "spanMessage")
    private static WebElement errorMsg;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public static String verifyTitle(){

        return HelperMethods.doGetPageTitle();
    }

    public static void enterUsername(String user){

        HelperMethods.sendText(userName, user);
    }

    public static void enterPassword(String pass){
        HelperMethods.sendText(password, pass);
    }

    public static void clickOnLoginBtn(){
        HelperMethods.doClick(loginBtn);
    }

    public static String getErrorMessage(){
      return HelperMethods.doGetText(errorMsg);
    }


    }


