package br.com.borarachar;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    
protected WebDriver driver;

public BaseTest(WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver = driver;
}
public BaseTest(){
}

public void start(){
    
    WebDriverManager.chromedriver().setup();   // Configurar o WebDriverManager para baixar e configurar o driver do Chrome
    
    // Configurar as opções do Chrome para o modo headless
   // ChromeOptions chromeOptions = new ChromeOptions();
    //chromeOptions.addArguments("--headless");
        // Inicializar o driver do Chrome com as opções configuradas
    //driver = new ChromeDriver(chromeOptions);
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    driver.get("http://borarachar.online/");

}


}
