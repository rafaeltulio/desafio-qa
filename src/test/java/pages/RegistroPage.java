package pages;

import maps.RegistroElementMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegistroPage extends RegistroElementMap {

    WebDriverWait wait = new WebDriverWait(driver, 30);

    public RegistroPage() {

        PageFactory.initElements(driver, this);
    }

    public void preencherNome(String nome) {
        primeiroNome.clear();
        primeiroNome.sendKeys(nome);
    }

    public void preencherSobreNome(String sobrenome) {
        sobreNome.clear();
        sobreNome.sendKeys(sobrenome);
    }

    public void preencherUsuario(String userName) {
        userInput.clear();
        userInput.sendKeys(userName);
    }

    public void preencherSenha(String senha) {
        inputSenha.clear();
        inputSenha.sendKeys(senha);
    }

    public void clicarCaptcha() throws InterruptedException {
        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeCaptcha));
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(reCaptcha)).click();
        driver.switchTo().parentFrame();

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameRecaptcha));
        Thread.sleep(30);
        wait.until(ExpectedConditions.elementToBeClickable(iconSolver)).click();
    }

    public void clickRegistroButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        Thread.sleep(30);

        WebElement btnRegister = driver.findElement(By.xpath("//button[@id='register']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", btnRegister);

    }

    public void validarMensagemErro(String mensagemErro) {
        assertTrue(msgError.isDisplayed());
        assertEquals(mensagemErro, msgError.getText());
        System.out.print("Mensagem de Erro" + msgError.getText());
    }

    public void acessarLogin() {

        btnBackLogin.click();
    }
    public void preencherLoginSenha(String usuarioCriado) {
        userInput.clear();
        userInput.sendKeys(usuarioCriado);

        inputSenha.clear();
        inputSenha.sendKeys("Qa292808@");

        btnLogin.click();

    }
    public void validarUserLogado(String usuarioCriado) throws InterruptedException {
        Thread.sleep(30);
        assertEquals(usuarioCriado, userNameValue.getText());
    }
}


