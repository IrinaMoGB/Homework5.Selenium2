import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Search extends AbstractTest {
    @Test
    void test() throws InterruptedException {

        getDriver().get("https://shop.tastycoffee.ru");
        String firstWindow = getDriver().getWindowHandle();


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
        WebElement loginButtonWindow =
                getDriver().findElement(By.xpath("//*[@id=\"openSearch_h\"]"));
        loginButtonWindow.click();

        Thread.sleep(1000);

        WebElement searchButton = getDriver().findElement(By.xpath("//*[@id=\"search_h\"]"));
        searchButton.click();

        Thread.sleep(1000);

        WebElement searchInput = getDriver().findElement(By.cssSelector("/html/body/div[3]/div[2]/div/form/div/div/input"));
        searchInput.sendKeys("колумбия");

        searchButton.click();

        Thread.sleep(1000);

        getDriver().switchTo().window(firstWindow);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath("/html/body/div[1]/header/div[1]/div/a[2]")));
    }
}
