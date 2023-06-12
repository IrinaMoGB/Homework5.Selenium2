import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CitySelection extends AbstractTest {
    @Test
    void test() throws InterruptedException {

        getDriver().get("https://shop.tastycoffee.ru");

        WebElement citySelectionButton = getDriver().findElement(By.xpath("//*[@id=\"city_open\"]/span[1]"));
        new Actions(getDriver()).moveToElement(citySelectionButton).perform();

        WebElement citySTPeterburg = getDriver().findElement(By.xpath("//*[@id=\"city_popup\"]/form/div[2]/div/div[4]/a"));
        citySTPeterburg.click();

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath("//*[@id=\"city_header\"]")));

    }
}
