package br.com.borarachar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePO extends BasePO {

    public HomePO(WebDriver driver) {
        super(driver);
    }


    public void logoBoraRachar(){

        driver.findElement(By.id("logo")).getText();
       
    }
    
}
