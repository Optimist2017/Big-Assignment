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

class profilePage extends PageBase {

    private By allowEditBtn = By.xpath("//*[@id='c_ModifyProfileWizard_c_CertiportProfileTabStep_c_EditCertiportBtn_c_CommandBtn']");
    private By phoneText = By.xpath("//*[@id='c_ModifyProfileWizard_c_CertiportProfileTabStep_c_UserContactInfo_c_Phone']");
    private By studentIdText = By.xpath("//*[@id='c_ModifyProfileWizard_c_CertiportProfileTabStep_c_UserContactInfo_c_StudentID']");
    private By submitBtn = By.xpath("//*[@id='c_ModifyProfileWizard_c_SubmitButton_c_CommandBtn']");


    public profilePage(WebDriver driver) {
        super(driver);
    }

    public profilePage allowEdit(){
        this.waitAndReturnElement(allowEditBtn).click();
        return new profilePage(this.driver);
    }

    public DashboardPage saveProfile(String phone, String studentId){
        this.waitAndReturnElement(phoneText).sendKeys(phone);
        this.waitAndReturnElement(studentIdText).sendKeys(studentId);
        this.waitAndReturnElement(submitBtn).click();
        return new DashboardPage(this.driver);
    }

}