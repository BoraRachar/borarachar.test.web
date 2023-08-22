package br.com.borarachar;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    @Test
    public void TC_001_DeveValidarOsInputDeLogin() throws InterruptedException{
        HomePO home = new HomePO(driver);
        LoginPO login = new LoginPO(driver);
        home.buttonLogin(); Thread.sleep(300);
        login.inputEmailLogin("borarachar");
        login.inputPasswordLogin(""); Thread.sleep(500);
        login.buttonAcessarMinhaConta();
        Assert.assertEquals("E-mail inva\u0301lido", driver.findElement(By.id("input-error-email")).getText());
        Assert.assertEquals("Senha obrigato\u0301ria", driver.findElement(By.id("input-error-password")).getText());
        login.inputEmailLogin("borarachar@borarachar.com");
        login.inputPasswordLogin("Aa34567#");
    }
    
    @Test
    public void TC_002_DeveTerAOpcaoDeEsqueciMinhaSenha() throws InterruptedException{
        HomePO home = new HomePO(driver);
        LoginPO login = new LoginPO(driver);
        home.buttonLogin(); Thread.sleep(3000);
        login.buttonEsqueciSenha();

    }
    
}
