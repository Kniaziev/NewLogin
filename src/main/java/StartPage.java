import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Kasha on 18.11.2015.
 */
public class StartPage {
    protected WebDriver driver;

    public StartPage(WebDriver driver) {
        this.driver = driver;}

    @FindBy(id="login-email")
    private static WebElement loginEmailInput;

    @FindBy(id="login-password")
    private static WebElement loginPasswordInput;

    @FindBy(xpath = "//input[@name='submit']")
    private static WebElement loginSubmitButton;

    public static void loginUser(String userEmail, String userPassword){
        loginEmailInput.sendKeys(userEmail);
        loginPasswordInput.sendKeys(userPassword);
        loginSubmitButton.click();
        //return PageFactory.initElements(driver, HomePage.class);
    }

    public  void open() {
        driver.get("https://www.linkedin.com/");
    }

    public void close() {
        driver.quit();
    }
}
