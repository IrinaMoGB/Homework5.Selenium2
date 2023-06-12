import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Community extends AbstractTest {
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

        WebElement searchButton = getDriver().findElement(By.xpath("//input[@name='community_q']"));
        searchButton.click();

        Thread.sleep(1000);

        WebElement searchInput = getDriver().findElement(By.cssSelector(".search-community__input"));
        searchInput.sendKeys("эфиопия");

        searchButton.click();

        Thread.sleep(3000);

        WebElement channelsButton = getDriver().findElement(By.xpath("//a[contains(text(),'Каналы')]"));
        channelsButton.click();

        Thread.sleep(1000);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath(".//a[text()='Войти']")));

    }
}
