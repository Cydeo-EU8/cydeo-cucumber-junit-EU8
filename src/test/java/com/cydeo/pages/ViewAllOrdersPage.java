package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrdersPage extends BasePage{

    public ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
