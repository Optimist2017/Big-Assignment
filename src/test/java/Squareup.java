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
import java.util.*;  


public class Squareup{
    public WebDriver driver;
    
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @Test
    public void testSearch() {
        MainPage mainPage = new MainPage(this.driver);
        
        Assert.assertTrue(mainPage.staticPage().contains("Get paid fast from anywhere."));
        LoginPage loginPage = mainPage.openLogin("tenefe9714@yehudabx.com");
        
        // DashboardPage dashboardPage = loginPage.login("jarifi4728@684hh.com","jarifi4728");
        DashboardPage dashboardPage = loginPage.login("tenefe9714@yehudabx.com", "hellohowareyou");
        
        // System.out.println(dashboardPage.getMainCardTitle());
        // System.out.println(dashboardPage.getDashboardMessageTitle());
        // Assert.assertTrue(dashboardPage.getMainCardTitle().contains("Start by creating your first Doodle"));

        Assert.assertTrue(dashboardPage.getDashboardMessageTitle().contains("Welcome back"));
        Assert.assertTrue(dashboardPage.getDashboardToday().contains("Today"));
        
        

        
        

        
        
        
        // Assert.assertTrue(logoutPage.getLogoutMessageTitle().contains("You are signed out."));
    }
    

    
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
// tenefe9714@yehudabx.com hellohowareyou