package pageObject.swagLabsTest;

import pageObject.hook.Hook;
import pageObject.pages.LoginPage;
import pageObject.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class LoginTest extends Hook {

    @Test
    public void SuccessLoginTest(){
        //I do a login
        pageObject.pages.LoginPage LoginPage = new LoginPage(driver);
         LoginPage.userSendKeys("standard_user");
         LoginPage.passSendKeys("secret_sauce");
         LoginPage.loginBtn();

        //Check the title
        pageObject.pages.HomePage HomePage = new HomePage(driver);
        String title = HomePage.getTitle().toLowerCase(Locale.ROOT);
        Assert.assertEquals(title,"products");
    }
}