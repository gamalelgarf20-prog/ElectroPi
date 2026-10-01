
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class InventoryPage extends PageBase {
    public InventoryPage(WebDriver driver) {
        super(driver);
    }


    private By AddProductLocator = By.linkText("AddProduct");
    private By ProductNameLocator = By.className("ProductName");

    private By PriceLocator = By.id("Price");
    private By SaveBtnLocator = By.id("Save");
    private By ToastSuccessMessageLocator = By.id("ToastMessage");


    public void AddProduct(String ProductName, String Price) {
        ClickElement(AddProductLocator);
        ClickElement(ProductNameLocator);
        SetText(ProductNameLocator, ProductName);
        ClickElement(PriceLocator);
        SetText(PriceLocator, Price);
        ClickElement(SaveBtnLocator);
    }

    public String GetToastMessageText() {
        return GetText(ToastSuccessMessageLocator);
    }

    public Boolean ToastMessageIsAppear() {
        return GetElement(ToastSuccessMessageLocator).isDisplayed();
    }


}
