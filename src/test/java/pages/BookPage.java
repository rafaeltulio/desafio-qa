package pages;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import maps.BookElementMap;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class BookPage extends BookElementMap {

    public BookPage() {
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, 20);
    public void validarCodigoIbsn(String codigoIbsn) {
        assertEquals(codigoIbsn, codigoIbsnLabel.getText());
        System.out.println("Código IBSN " + codigoIbsnLabel.getText());
    }

    public void validarNomeAutor(String nomeAutor) {
        assertEquals(nomeAutor, nomeAutorLabel.getText());
        System.out.println("Nome do Autor " + nomeAutorLabel.getText());
    }

    public void addLivroColecao() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addNewRecordButton.click();

        Alert alerta = wait.until(ExpectedConditions.alertIsPresent());
        String text = alerta.getText();

        alerta.accept();
    }

    public void selecionarMenuProfile() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        menuProfile.click();
    }

    public void verificarLivro(String book) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals(book, livroLabel.getText());
        System.out.println("Nome do Livro Adicionado "+livroLabel.getText());
        iconeDeletar.click();
       // confirmeDelet.click();
    }
}
