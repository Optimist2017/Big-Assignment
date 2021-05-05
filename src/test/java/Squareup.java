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
        
        Newsletter newsletter = mainPage.suscribe();

        MainPage backhome = newsletter.subscription("nical", "dghetian", "nical40577@dghetian.com", "TechCorp", "Ecuador");

        LoginPage loginPage = mainPage.openLogin();
    
        DashboardPage dashboardPage = loginPage.login("nical40577", "iamanightlover");

        Assert.assertTrue(dashboardPage.getDashboardMessageTitle().contains("My Exams"));
        Assert.assertTrue(dashboardPage.getDashboardToday().contains("You have no assigned exam vouchers"));

        profilePage ppage = dashboardPage.profile();

        profilePage editprofile = ppage.allowEdit();

        DashboardPage saveProfile = ppage.saveProfile("9946789", "m2mefhg");

        MainPage logout = dashboardPage.openLogout();
        
    }
    

    
    @After
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}
// nical40577@dghetian.com iamanightlover