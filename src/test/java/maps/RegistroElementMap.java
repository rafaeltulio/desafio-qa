package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.CommonPage;

public class RegistroElementMap extends CommonPage {

    @FindBy(how = How.ID, using = "firstname")
    protected static WebElement primeiroNome;
    @FindBy(how = How.ID, using = "lastname")
    protected static WebElement sobreNome;

    @FindBy(how = How.ID, using = "userName")
    protected static WebElement userInput;

    @FindBy(how = How.ID, using = "password")
    protected static WebElement inputSenha;
    @FindBy(how = How.XPATH, using = "//div[@id='rc-imageselect']/div[3]/div[2]/div/div/div[4]")
    protected static WebElement iconSolver;

    @FindBy(how = How.XPATH, using = "//iframe[@title='recaptcha challenge expires in two minutes']")
    protected static WebElement frameRecaptcha;

    @FindBy(how = How.CSS, using = ".recaptcha-checkbox-border")
    protected static WebElement reCaptcha;

    @FindBy(how = How.XPATH, using = "//iframe[@title='reCAPTCHA']")
    protected static WebElement iframeCaptcha;

    @FindBy(how = How.ID, using = "userForm")
    protected static WebElement userForm;

    @FindBy(how = How.CSS, using = "#register")
    protected static WebElement botaoRegistro;

    @FindBy(how = How.XPATH, using = "//p[@id='name']/font/font")
    protected static WebElement msgError;

    @FindBy(how = How.ID, using = "gotologin")
    protected static WebElement btnBackLogin;

    @FindBy(how = How.ID, using = "login")
    protected static WebElement btnLogin;

    @FindBy(how = How.ID, using = "userName-value")
    protected static WebElement userNameValue;

}
