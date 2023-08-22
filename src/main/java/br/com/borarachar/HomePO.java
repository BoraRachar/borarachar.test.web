package br.com.borarachar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePO extends BasePO {

    public HomePO(WebDriver driver) {
        super(driver);
    }

    public void logoBoraRachar() {
        driver.findElement(By.id("logo")).getText();
    }
    public void buttonLogin(){
        driver.findElement(By.id("link-login")).click();
    }
     public void buttonCriarConta(){
        driver.findElement(By.cssSelector("#menu > div > div > div.flex.items-center.justify-end.w-2\\/4 > div > a > button")).click();
    }



}
