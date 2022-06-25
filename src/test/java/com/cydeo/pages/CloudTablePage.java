package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablePage {
    public CloudTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button/span[.='New']")
    public WebElement newPerson;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;


}
