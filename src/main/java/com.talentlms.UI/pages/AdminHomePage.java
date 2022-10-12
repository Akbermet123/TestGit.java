package com.talentlms.UI.pages;


import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage extends BasePage {


    @FindBy(xpath="//span[@class='tl-box-title-options']")
    public WebElement adminHomeTitle;


}



