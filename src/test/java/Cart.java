import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cart extends AbstractTest {
    @Test
    void test() throws InterruptedException {

        getDriver().get("https://shop.tastycoffee.ru");

        String firstWindow = getDriver().getWindowHandle();

        WebElement loginButtonHeader = getDriver().findElement(By.xpath(".//a[text()='Войти']"));
        loginButtonHeader.click();


        WebElement inputNameField = getDriver().findElement(By.xpath("//*[@id=\"email\"]"));
        inputNameField.click();
        inputNameField.sendKeys("irinamo.coffee@gmail.com");

        Thread.sleep(1000);

        WebElement inputPasswordField = getDriver().findElement(By.xpath(".//input[@id = 'password']"));
        inputPasswordField.click();
        inputPasswordField.sendKeys("Ilovecoffee1");

        Thread.sleep(1000);

        WebElement linkTextCoffee =
                getDriver().findElement(By.xpath("a[contains(@href, 'https://shop.tastycoffee.ru/coffee?methods=3a%2C4a')]"));
        linkTextCoffee.click();

        Thread.sleep(1000);

        WebElement addButton = getDriver().findElement(By.xpath("//*[@id=\"catalog-products\"]/div[1]/div[4]/form/div[4]/div/a"));
        addButton.click();

        Thread.sleep(1000);

        WebElement linkTextChocolate =
                getDriver().findElement(By.xpath("/html/body/div[1]/header/div[1]/div/div[10]/div[1]/ul/li[4]/a"));
        linkTextChocolate.click();

        Thread.sleep(1000);

        WebElement buyButton = getDriver().findElement(By.xpath("(//a[@onclick='add_in_cart(this);return false;'])[2]"));
        buyButton.click();

        Thread.sleep(1000);

        WebElement linkTextCart =
                getDriver().findElement(By.xpath("//a[contains(text(),'Перейти в корзину')]"));
        linkTextCart.click();

        Thread.sleep(3000);
        getDriver().switchTo().window(firstWindow);

        Assertions.assertDoesNotThrow(() -> getDriver().findElement(By.xpath("/html/body/div[3]/div/div/h1")));
}
}
