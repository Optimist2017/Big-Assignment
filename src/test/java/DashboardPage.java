import org.junit.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


class DashboardPage extends PageBase {

    // private By mainCardBy = By.xpath("//div[@class='Card-content']/div/div/h2/span");

    private By dashboardMessage = By.xpath("//div[@id='dashboard-container']/div/div/div[2]/div[2]/div/div/div/div/div/div/div/h2");

    private By dashboardToday = By.xpath("//div[@id='dashboard-container']/div/div/div[2]/div[2]/div/div/div/div/div/h3");
    private By logoutMenuButtonBy = By.xpath("//div/div/div/div/div/div[@id='ember83']/div/button");
    private By logoutClickButtonBy = By.xpath("//*[@id='ember79']");
    private By showLogout = By.xpath("//div/div/div/div/div[@id='ember70']/div/button");


    public DashboardPage(WebDriver driver) {
        super(driver);
    }    

    public String getDashboardMessageTitle(){
        // System.out.println(this.waitAndReturnElement(dashboardMessage).getText());
        return this.waitAndReturnElement(dashboardMessage).getText();
    }

    public String getDashboardToday(){
        
        // System.out.println(this.waitAndReturnElement(logoutClickButtonBy));
        return this.waitAndReturnElement(dashboardToday).getText();
    }

    

    public Logout openLogout() {
        
        // this.waitAndReturnElement(logoutMenuButtonBy).click();
        // this.waitAndReturnElement(logoutClickButtonBy).click();
        return new Logout(this.driver);
    }
}
// tenefe9714@yehudabx.com  hellohowareyou