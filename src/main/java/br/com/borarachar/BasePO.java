package br.com.borarachar;

import org.openqa.selenium.WebDriver;

public class BasePO {
    
    protected WebDriver driver;

    public BasePO(WebDriver driver) {
        this.driver = driver;
    }
}
