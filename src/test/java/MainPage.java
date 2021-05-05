import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


class MainPage extends PageBase {

    
    private By loginMenuButtonBy = By.xpath("//*[@id='p_lt_ctl01_UtilityLink3_btnElem_hyperLink']");
    private By suscribeLinkBtn = By.xpath("//*[@id='js-footerNav']/div/div[5]/ul/li[6]/a");

    

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://certiport.pearsonvue.com/");
        System.out.println(this.driver.getTitle());
    }
    
    public LoginPage openLogin() {
        this.waitAndReturnElement(loginMenuButtonBy).click();
        return new LoginPage(this.driver);
    }

    public Newsletter suscribe(){
        this.waitAndReturnElement(suscribeLinkBtn).click();
        return new Newsletter(this.driver);
    }

    

    // melecib332@cnxingye.com ilove1000$

}
