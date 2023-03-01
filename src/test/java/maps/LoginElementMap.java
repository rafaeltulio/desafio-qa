package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.CommonPage;

public class LoginElementMap extends CommonPage {

    @FindBy(how = How.ID, using = "userName")
    protected static WebElement inputUsuario;

    @FindBy(how = How.ID, using = "password")
    protected static WebElement inputSenha;

    @FindBy(how = How.ID, using = "login")
    protected static WebElement btnLogin;

    @FindBy(how = How.ID, using = "userName-value")
    protected static WebElement userNameValue;


}
