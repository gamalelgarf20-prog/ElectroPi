import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }



private By usernamelocator=By.id("username");
private By passwordlocator=By.id("password");
private By SaveBtnLocator=By.linkText("Save");


public InventoryPage LoginAsStoreAdmin(String username , String password ){

    ClickElement(usernamelocator);
    SetText(usernamelocator,username);
    ClickElement(passwordlocator);
    SetText(passwordlocator,password);
    ClickElement(SaveBtnLocator);
    return new InventoryPage(Driver);

}


}
