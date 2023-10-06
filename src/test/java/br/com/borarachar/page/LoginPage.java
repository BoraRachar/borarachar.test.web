package br.com.borarachar.page;

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

    @FindBy(id="link-login")
    private WebElement buttonLogin;

    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-password")
    private WebElement inputpassword;

    @FindBy(css =  "#checkbox-label-Mantenha-me\\ conectado")
    private WebElement checkbox;

    @FindBy(css = "body > section > section > section > form > input")
    private WebElement buttonAcessarMinhaConta;
    
    @FindBy(css = "body > section > section > section > form > section > a > p")
    private WebElement buttonEsqueciSenha;

    @FindBy(id = "input-error-email")
    private WebElement spanEmailError;

    @FindBy(id = "input-error-password")
    private WebElement spanPasswordError;

    @FindBy(css = "body > section > section > section > form > fieldset:nth-child(2) > div > svg:nth-child(3)")
    private WebElement viewBox;


    public LoginPage digitaCamposIncorretoNosInputsEmailSenha(){
        buttonLogin.click();
        inputEmail.sendKeys("borarachar");
        inputpassword.sendKeys("");
        buttonAcessarMinhaConta.click();
        return new LoginPage(driver); // Quando for criada a Homepage usuario cadastrado alterar o retorno!
    }

    public Boolean validaMensagemErroCampoEmailSenha(){
      spanEmailError.isDisplayed();
      spanPasswordError.isDisplayed();
      return true;
    }
    
    public LoginPage digitarCamposCorretosNosInputEmailSenha(){
        inputEmail.clear();
        inputEmail.sendKeys("borarachar@bora.com");
        inputpassword.clear();
        inputpassword.sendKeys("123456Ll@");
        viewBox.click();
        checkbox.click();
        buttonAcessarMinhaConta.click();
        return new LoginPage(driver);
    }

    public ForgetPassword redirecionarParaEsqueciMinhaSenha(){
        buttonLogin.click();
        buttonEsqueciSenha.click();
        return new ForgetPassword(driver);
    }
}
