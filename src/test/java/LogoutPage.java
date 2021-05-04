import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LogoutPage extends PageBase {

    private By logoutMessage = By.xpath("//main/div/section/div/div/h2");

    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public String getLogoutMessageTitle() {
        System.out.println(this.waitAndReturnElement(logoutMessage).getText());
        return this.waitAndReturnElement(logoutMessage).getText();
    }
}
