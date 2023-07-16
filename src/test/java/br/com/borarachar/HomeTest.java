package br.com.borarachar;

import org.junit.Test;

public class HomeTest extends BaseTest{

    @Test
    public void confirmaPagina(){
   HomePO home = new HomePO(driver);
        home.logoBoraRachar();
        driver.quit();
    }
    
}
