package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.CommonPage;

public class HomeElementMap extends CommonPage {

    @FindBy(how = How.ID,using = "newUser" )
    public WebElement botaoNewUser;

    @FindBy(how = How.ID,using = "gotoStore" )
    public WebElement btnGoToStore;

    @FindBy(how = How.ID,using = "searchBox" )
    public WebElement inputSearchBox;

    @FindBy(how = How.XPATH,using = "//span[@id='see-book-Git Pocket Guide']" )
    public WebElement linkLivro;

}
