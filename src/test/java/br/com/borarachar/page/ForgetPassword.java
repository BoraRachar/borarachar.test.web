package br.com.borarachar.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.borarachar.BaseTest;

public class ForgetPassword extends BaseTest {
    public ForgetPassword(WebDriver driver){
        super(driver);
    }

@FindBy(id = "input-email")
private WebElement inputEmail;

@FindBy(id="input-error-email")
private WebElement spanErrorEmail;

@FindBy(css = "body > section > section > section > form > input")
private WebElement buttonRecuperarSenha;

@FindBy(css = "body > section > section > section > form > p > a")
private WebElement buttonReturnLogin;

@FindBy(css = "body > section > div > section > div > h1")
private WebElement mensageConfirmEmail;



public ForgetPassword validaEmailNaoCadastrado(){
    inputEmail.sendKeys("emailinvalido@invalido");
    buttonRecuperarSenha.click();
    return new ForgetPassword(driver);
}

public String confirmacaoDeEnvioDeEmail(){
    inputEmail.sendKeys("kixiyey180@hapincy.com");
    buttonRecuperarSenha.click();
    return mensageConfirmEmail.getText();
}

public String validaMensagemDeErroNoEmail(){
        return spanErrorEmail.getText();

}
}
