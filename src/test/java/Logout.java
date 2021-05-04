
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

public class Logout extends PageBase {

    // private By logoutMenuButtonBy = By.xpath("//*[@id='ember84']");
    private By logoutClickButtonBy = By.xpath("//*[@id='ember79']");

    public Logout(WebDriver driver){
        super(driver);
    }

    public LogoutPage logout() {
        // this.waitAndReturnElement(logoutMenuButtonBy).click();
        System.out.println(this.waitAndReturnElement(logoutClickButtonBy));
        this.waitAndReturnElement(logoutClickButtonBy).click();
        return new LogoutPage(this.driver);
    }
    
}
