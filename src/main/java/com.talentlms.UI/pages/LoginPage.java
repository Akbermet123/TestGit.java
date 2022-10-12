package com.talentlms.UI.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{



    @FindBy(xpath = "//input[@name='login']")
    public WebElement usernameOrEmailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement loginButton;

    public LoginPage inputUserNameOrEmail(String userNameOrEmail){
        helper.sendKeys(usernameOrEmailInput,userNameOrEmail);
        return this;
    }

    public LoginPage inputPassword(String password){
        helper.sendKeys(passwordInput,password);
        return this;
    }

    public LoginPage clickLoginButton(){
        helper.click(loginButton);
        return this;
    }

//    String parentPage = driver.getWindowHandle();
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://youtu.be/n-jVNxIhY6M?t=40");
//        driver.switchTo().window(parentPage);
//        for (int i = 0; i < 100; i++) {
//        addNewUserPage.inputFirstName(MockDataGenerator.generateMockFirstName())
//                .inputLastName(MockDataGenerator.generateMockLastName())
//                .inputPassword(MockDataGenerator.generateMockPassword())
//                .inputUserName(MockDataGenerator.generateMockUserName())
//                .inputEmailAddress(MockDataGenerator.generateMockEmail())
//                .inputBio(MockDataGenerator.generateMockBio());
    }


