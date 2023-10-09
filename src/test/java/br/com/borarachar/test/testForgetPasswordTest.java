package br.com.borarachar.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.borarachar.BaseTest;
import br.com.borarachar.page.ForgetPassword;
import br.com.borarachar.page.LoginPage;

public class testForgetPasswordTest extends BaseTest {

    public testForgetPasswordTest() {
    }

    @BeforeEach
    public void setUp() {
        super.start(); 
    }

@Test
@DisplayName("")
public void TC_001_DeveValidarOCampoObrigatorioDeEmail() throws InterruptedException{

    String spanErroEmail = new LoginPage(driver)
        .redirecionarParaEsqueciMinhaSenha()
        .validaEmailNaoCadastrado()
        .validaMensagemDeErroNoEmail();

        Assertions.assertEquals("Email incorreto ou inexistente", spanErroEmail);

    String confirmaEmail = new ForgetPassword(driver)
        .confirmacaoDeEnvioDeEmail();

        Assertions.assertEquals("Email de recuperação enviado!", confirmaEmail);
}




}
