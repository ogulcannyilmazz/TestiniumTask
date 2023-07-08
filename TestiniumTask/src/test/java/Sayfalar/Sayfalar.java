package Sayfalar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Sayfalar {

    WebDriver driver;

    public Sayfalar(WebDriver driver) {
        this.driver = driver;
    }

    public void elementBekleme(String elementID) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementID)));
    }
    public void elementBeklemePath(String elementID) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementID)));
    }
    public void kelimeYazma(String elemendID, String yazi){
        driver.findElement(By.cssSelector(elemendID)).sendKeys(yazi);
    }
    public void tiklaCss(String elementID){
        driver.findElement(By.cssSelector(elementID)).click();
    }
    public void tiklaId(String elementID){
        driver.findElement(By.id(elementID)).click();
    }
    public void tiklaPath(String elementID){
        driver.findElement(By.xpath(elementID)).click();
    }

}
