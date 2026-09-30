


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    protected static WebDriver Driver;

    public static WebDriverWait wait;
    public JavascriptExecutor js;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 70);
        js = (JavascriptExecutor) driver;
        this.Driver = driver;
    }

    public static void ClickElement(By locator) {
        GetElement(locator).click();
    }


    public static void SetText(By locator, String Text) {
        GetElement(locator).sendKeys(Text);
    }

    public static String GetText(By locator) {
        return GetElement(locator).getText();
    }



    public static void WaitElementToBeClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(Driver.findElement(locator)));
    }




    public static void WaitElementToBevisiable(By locator) {
        wait.until(ExpectedConditions.visibilityOf(Driver.findElement(locator)));
    }

    public static void WaitpresenceOfElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }



    public void WaitElementToBestale(By locator) {
        wait.until(ExpectedConditions.stalenessOf(Driver.findElement(locator)));
    }






    public static WebElement GetElement(By locator) {
        WaitpresenceOfElement(locator);
        WaitElementToBevisiable(locator);
        WaitElementToBeClickable(locator);
        return Driver.findElement(locator);
    }

}
