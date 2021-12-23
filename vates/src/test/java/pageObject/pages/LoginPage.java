package pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    By usernameLocator = By.id("user-name");
    By passwordLocator = By.id("password");
    By loginBtnLocator = By.id("login-button");

    public LoginPage(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public void userSendKeys(String username) {
        WebElement txtUsername = driver.findElement(usernameLocator);
        txtUsername.sendKeys(username);
    }

    public void passSendKeys(String username) {
        WebElement txtPassword = driver.findElement(passwordLocator);
        txtPassword.sendKeys(username);
    }

    public void loginBtn(){
        WebElement btnLogin = driver.findElement(loginBtnLocator);
        btnLogin.click();
    }

}