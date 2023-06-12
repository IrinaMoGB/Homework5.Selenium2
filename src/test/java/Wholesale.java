import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Wholesale extends AbstractTest {
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

        WebElement linkTextBusinessCoffee =
                getDriver().findElement(By.xpath("//a[contains(text(),'Кофе для бизнеса')"));
        linkTextBusinessCoffee.click();

        Thread.sleep(1000);

        WebElement linkTextGetPrices =
                getDriver().findElement(By.xpath("//div[@id='get-prices']"));
        linkTextGetPrices.click();

        Thread.sleep(3000);

        WebElement linkTextAboutCompany =
                getDriver().findElement(By.xpath("//a[contains(text(),'О компании')]"));
        linkTextAboutCompany.click();

        Thread.sleep(1000);

        Assertions.assertEquals("https://shop.tastycoffee.ru/blog/sposoby-prigotovleniya", getDriver().getCurrentUrl());

    }
}
