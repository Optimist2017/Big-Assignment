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

    
    private By loginMenuButtonBy = By.id("735gGmzBRZBLLrnQxBIs8O");
    private By staticMsg = By.xpath("//*[@id='main-content']/div/section[4]/div[2]/div/div[3]/div/div/div[2]/div/h3");

    private By notificationButton = By.xpath("//main/div/section[12]/div/div/form/div/div/div/div/div/input");

    
    

    // 735gGmzBRZBLLrnQxBIs8O

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://squareup.com/us/en");
        System.out.println(this.driver.getTitle());
    }    
    
    public String staticPage() {
        return this.waitAndReturnElement(staticMsg).getText();
    }
    
    public LoginPage openLogin(String email) {
        this.waitAndReturnElement(notificationButton).sendKeys(email);
        this.waitAndReturnElement(loginMenuButtonBy).click();
        return new LoginPage(this.driver);
    }

}
