package br.com.borarachar;

import org.junit.Test;
import org.openqa.selenium.By;



public class RegisterTest extends BaseTest{
    
    @Test
    public void TC_001_DeveValidarOsInputsDoCadastro(){
        driver.get("http://borarachar.online/register");
        RegisterPO register = new RegisterPO(driver);
        register.InputEmailRegister("");
        register.InputPasswordRegister("");
        register.InputConfirmPassword("");
        register.SeePassword();
    }

    @Test
    public void TC_002_DeveExibirASenha() throws InterruptedException{
        driver.get("http://borarachar.online/register");
        RegisterPO register = new RegisterPO(driver);
        register.SeePassword();
    }
}
