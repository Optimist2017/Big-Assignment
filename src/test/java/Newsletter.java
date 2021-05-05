import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

class Newsletter extends PageBase {

    private By nameInputBoxBy = By.name("email");
    private By passwordInputBoxBy = By.name("password");

    private By firstName = By.xpath("//*/form[@name='CATC_0000_OPT-IN']/ul/li/div/input[@name='firstName']");
    private By lastName = By.xpath("//*/form[@name='CATC_0000_OPT-IN']/ul/li/div/input[@name='lastName']");
    private By emailAddress = By.xpath("//*/form[@name='CATC_0000_OPT-IN']/ul/li/div/input[@name='emailAddress']");
    private By company = By.xpath("//*/form[@name='CATC_0000_OPT-IN']/ul/li/div/input[@name='company']");
    private By country = By.xpath("//*/form[@name='CATC_0000_OPT-IN']/ul/li/div/select[@name='country']");
    private By privacy = By.xpath("//*/form[@name='CATC_0000_OPT-IN']/ul/li/span/input[@id='privacy']");
    private By option = By.xpath("//*/form[@name='CATC_0000_OPT-IN']/ul/li/span/input[@id='optin']");
    private By submitBtn = By.xpath("//*/form[@name='CATC_0000_OPT-IN']/ul/li[8]/div[2]/input[@type='submit']");

    public Newsletter(WebDriver driver) {
        super(driver);
        driver.switchTo().frame(0);
    }

    public MainPage subscription(String fname, String lname,String email,String comp,String countrye){

        System.out.println(this.getBodyText());

        this.waitAndReturnElement(firstName).sendKeys(fname);
        this.waitAndReturnElement(lastName).sendKeys(lname);
        this.waitAndReturnElement(emailAddress).sendKeys(email);
        this.waitAndReturnElement(company).sendKeys(comp);
        Select drpCountry = new Select(this.waitAndReturnElement(country));
        drpCountry.selectByVisibleText(countrye);
        this.waitAndReturnElement(privacy).click();
        this.waitAndReturnElement(option).click();
        this.waitAndReturnElement(submitBtn).click();

        return new MainPage(this.driver);

    }

}
