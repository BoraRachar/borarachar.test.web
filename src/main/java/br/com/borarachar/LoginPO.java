package br.com.borarachar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPO extends BasePO{

    
    public LoginPO(WebDriver driver) {
        super(driver);
    }

    public void backPage(){
        driver.findElement(By.id("link back page")).click();
    }

    public void inputEmailLogin(String email){
        driver.findElement(By.id("input-email")).sendKeys(email);  
    }

    public void inputPasswordLogin(String password){
        driver.findElement(By.id("input-password")).sendKeys(password);
    }

    public void checkbox(){
        driver.findElement(By.id("checkbox-title-Manter-me conectado")).click();
    }

    public void buttonAcessarMinhaConta(){
        driver.findElement(By.cssSelector("body > div.flex.items-center.justify-center > section > form > button > span")).click();
    }

    public void buttonEsqueciSenha(){
        driver.findElement(By.xpath("/html/body/div[1]/section/form/div/a")).getText();
    }
    
}
