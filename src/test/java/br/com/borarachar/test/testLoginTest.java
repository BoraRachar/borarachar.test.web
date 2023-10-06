package br.com.borarachar.test;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import br.com.borarachar.BaseTest;
import br.com.borarachar.page.LoginPage;

public class testLoginTest extends BaseTest {

   
public testLoginTest() {
    }

    @BeforeEach
    public void setUp() {
        super.start(); // Chame o método start da classe BaseTest para configurar o WebDriver
    }

    @Test
    @DisplayName("Deve validar os input de Login")
    public void TC_001_DeveValidarOsInputDeLogin(){
        boolean validaMensagemErroCampoEmailSenha = new LoginPage(driver)
            .digitaCamposIncorretoNosInputsEmailSenha()
            .validaMensagemErroCampoEmailSenha();
            
            Assertions.assertTrue(validaMensagemErroCampoEmailSenha);
        
         new LoginPage(driver)
            .digitarCamposCorretosNosInputEmailSenha();
            
            driver.quit();

 }
    
   
}
