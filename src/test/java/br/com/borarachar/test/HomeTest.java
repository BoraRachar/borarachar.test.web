package br.com.borarachar;

import org.junit.Test;

public class HomeTest extends BaseTest{

    @Test
    public void TC_001_DeveAcharLogoBoraRachar(){
        HomePO home = new HomePO(driver);
        home.logoBoraRachar();
        driver.quit();
    }
    @Test
    public void TC_002_DeveEntraNoLoginERetornaNaHomePage() throws InterruptedException{
        HomePO home = new HomePO(driver);
        LoginPO login = new LoginPO(driver);
        home.buttonLogin(); Thread.sleep(300);
        login.backPage(); Thread.sleep(300);
        home.logoBoraRachar();

    }

    
}
