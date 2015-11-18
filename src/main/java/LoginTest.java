import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.isDisplayed;

/**
 * Created by Kasha on 19.11.2015.
 */
public class LoginTest {

    private StartPage startPage;
    private StartPage loginEmailInput;
    String userEmail = "knyazev.alexandr@gmail.com";
    String userPassword = "4510698";

    @BeforeMethod
    public void initLoginPage(){
        PageFactory.initElements(new FirefoxDriver(), StartPage.class);
    }
    @Test
    public void userLoginTest(){
        StartPage.open();
        StartPage.loginUser(userEmail,userPassword);
        Assert.assertEquals(false, loginEmailInput.isDisplayed());
    }
}
