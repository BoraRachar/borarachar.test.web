package br.com.borarachar.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.borarachar.BaseTest;

public class LoginPage extends BaseTest{

    
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "link back page")
    private WebElement backPage;

    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-password")
    private WebElement inputpassword;

    @FindBy(id = "checkbox-title-Manter-me conectado")
    private WebElement checkbox;

    @FindBy(css = "body > div.flex.items-center.justify-center > section > form > button > span")
    private WebElement buttonAcessarMinhaConta;

    @FindBy(xpath = "/html/body/div[1]/section/form/div/a")
    private WebElement buttonEsqueciSenha;


    public LoginPage digitaCamposIncorretoNosInputsEmailSenha(){

    }
    
}
