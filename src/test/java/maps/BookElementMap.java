package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.CommonPage;

public class BookElementMap extends CommonPage {

    @FindBy(how = How.XPATH, using = "//div[@id='ISBN-wrapper']/div[2]/label")
    public WebElement codigoIbsnLabel;

    @FindBy(how = How.XPATH, using = "//div[@id='author-wrapper']/div[2]/label")
    public WebElement nomeAutorLabel;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Add To Your Collection')]")
    public WebElement addNewRecordButton;

    @FindBy(how = How.XPATH, using = "//span[@id='see-book-Git Pocket Guide']")
    public WebElement linkLivro;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Profile')]")
    public WebElement menuProfile;

    @FindBy(how = How.XPATH, using = "//span[@id='see-book-Git Pocket Guide']")
    public WebElement livroLabel;

    @FindBy(how = How.ID, using = "delete-record-undefined")
    public WebElement iconeDeletar;

    @FindBy(how = How.ID, using = "")
    public WebElement confirmeDelet;
}
