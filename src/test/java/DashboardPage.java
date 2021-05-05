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

    private By dashboardMessage = By.xpath("//*[@id='ctl19_c_RegisterVoucher_c_MyExamsLbl']");
    private By dashboardToday = By.xpath("//*[@id='ctl19_c_RegisterVoucher_c_NoExamsTitle']");
    private By logoutMenuButtonBy = By.xpath("//*[@id='c_Banner_c_LogoffBtn_c_BannerBtn']");
    private By profileBtn = By.xpath("//*[@id='c_Banner_c_MyProfileBtn_c_BannerBtn']");


    public DashboardPage(WebDriver driver) {
        super(driver);
    }    

    public String getDashboardMessageTitle(){
        return this.waitAndReturnElement(dashboardMessage).getText();
    }

    public String getDashboardToday(){
        return this.waitAndReturnElement(dashboardToday).getText();
    }

    public profilePage profile(){
        this.waitAndReturnElement(profileBtn).click();
        return new profilePage(this.driver);
    }

    public MainPage openLogout() {
        this.waitAndReturnElement(logoutMenuButtonBy).click();
        return new MainPage(this.driver);
    }
}
// tenefe9714@yehudabx.com  hellohowareyou