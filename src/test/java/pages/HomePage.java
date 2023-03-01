package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import maps.HomeElementMap;
import java.util.concurrent.TimeUnit;

public class HomePage extends HomeElementMap {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void validarUsuarioLogado() {
        driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
    }

    public void selecionarBotaoNovoUsuario() {
        driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
        botaoNewUser.click();
    }
    public void selecionarMenuLivraria() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        btnGoToStore.click();
    }

    public void preencherCampoLivro(String livro) {
        driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
        inputSearchBox.clear();
        inputSearchBox.sendKeys(livro);
    }

    public void selecionarLivroRetornado() {
        linkLivro.click();
    }
}

