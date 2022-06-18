package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    public CalculatorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public WebElement button(String buttonText){
        return Driver.getDriver().findElement(By.xpath("//span[.='"+buttonText+"']"));
    }
}
