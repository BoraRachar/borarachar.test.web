package br.com.borarachar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPO extends BasePO{

    public RegisterPO(WebDriver driver) {
        super(driver);
    }
    

    public void InputEmailRegister(String email){
        driver.findElement(By.id("input-email")).sendKeys(email);
    }

    public void InputPasswordRegister(String password){
        driver.findElement(By.id("input-password")).sendKeys(password);
    }

    public void InputConfirmPassword(String confirmPassword){
        driver.findElement(By.id("input-confirmPassword")).sendKeys(confirmPassword);
    }

    public void SeePassword(){
        driver.findElement(By.cssSelector("body > section > section > section > form > fieldset:nth-child(2) > div > svg:nth-child(3)")).click();
        driver.findElement(By.cssSelector("body > section > section > section > form > fieldset:nth-child(3) > div > svg:nth-child(3)")).click();
    }

    public void SubmitRegister(){
        driver.findElement(By.cssSelector("body > section > section > section > form > input")).click();
    }

    public void inputErroEmail() {
      driver.findElement(By.id("input-error-email")).getText();
    }



}
