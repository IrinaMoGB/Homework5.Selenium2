import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Authorization extends AbstractTest {

    @Test
    void test() throws InterruptedException {

        getDriver().get("https://shop.tastycoffee.ru");

        WebElement loginButtonHeader = getDriver().findElement(By.xpath(".//a[text()='Войти']"));
        loginButtonHeader.click();

        Thread.sleep(1000);

        WebElement inputNameField = getDriver().findElement(By.xpath("//*[@id=\"email\"]"));
        inputNameField.click();
        inputNameField.sendKeys("irinamo.coffee@gmail.com");

        Thread.sleep(1000);

        WebElement inputPasswordField = getDriver().findElement(By.xpath(".//input[@id = 'password']"));
        inputPasswordField.click();
        inputPasswordField.sendKeys("Ilovecoffee1");

        Thread.sleep(1000);
        getDriver().quit();

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath("//*[@id=\"email\"]")));
   
}
}
