import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTests extends BaseTest{

   private LoginPage loginPage;
   private String Admin="Admin";
   private String Password="Password";
   private String ProductName="Mouse";
   private String Price="25";
   private String SuccessMessage="Success";

@Test
    public void  AddNewProduct(){
    loginPage=new LoginPage(driver);
    InventoryPage inventoryPage=loginPage.LoginAsStoreAdmin(Admin,Password);
    inventoryPage.AddProduct(ProductName,Price);
    String ActualToastMessage =inventoryPage.GetToastMessageText();
    Assert.assertEquals(ActualToastMessage,SuccessMessage);
    Assert.assertTrue(inventoryPage.ToastMessageIsAppear());

}
}
