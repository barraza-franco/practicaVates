package pageObject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    By titleLocator = By.className("title");

    public HomePage(WebDriver remoteDriver){
        driver = remoteDriver;
    }

    public String getTitle() {
        WebElement title = driver.findElement(titleLocator);
        String txtTitle = title.getText();
        return txtTitle;
    }
}
