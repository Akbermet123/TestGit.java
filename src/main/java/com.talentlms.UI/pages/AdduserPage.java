package com.talentlms.UI.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdduserPage extends BasePage{


    @FindBy (xpath ="//input[@name='name']")
        public WebElement loginButton;

        @FindBy(xpath ="//input[@name='surname']" )
        public WebElement Lastname;

        @FindBy(xpath = "//input[@name='email']")
        public  WebElement UserEmail;

        @FindBy(xpath = "//input[@name='login']")
        public  WebElement UserLogin;

        @FindBy(xpath = "//input[@type='password']")
        public WebElement UserPassword;

        @FindBy(xpath = "//textarea[@id='841672962']")
         public WebElement UserBio;




    }

