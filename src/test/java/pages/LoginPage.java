package pages;

import org.openqa.selenium.support.PageFactory;


import maps.LoginElementMap;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPage extends LoginElementMap {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void preencherLoginSenha(String usuarioCriado) {
        inputUsuario.clear();
        inputUsuario.sendKeys(usuarioCriado);

        inputSenha.clear();
        inputSenha.sendKeys("Qa@292808");

        btnLogin.click();

        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElements(userNameValue));
        assertEquals(usuarioCriado, userNameValue.getText());

    }
}


