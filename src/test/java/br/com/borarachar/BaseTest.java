package br.com.borarachar;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    
protected WebDriver driver;

public BaseTest(WebDriver driver) {
    this.driver = driver;
}

@Before
public void start(){
    
    WebDriverManager.chromedriver().setup();   // Configurar o WebDriverManager para baixar e configurar o driver do Chrome
    
    // Configurar as opções do Chrome para o modo headless
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--headless");
        // Inicializar o driver do Chrome com as opções configuradas
    driver = new ChromeDriver(chromeOptions);

        driver.get("http://borarachar.online/");

}


}
