package og.Test6;

import org.Juniprojects.Fbloginpojo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogin extends Baseclass{
	public Fblogin() {
	PageFactory.initElements( driver, this);
}

// private web element;
@FindBy(id = "email")
private WebElement email;

@FindBy(xpath = "//input[@aria-label='Password']")
private WebElement password;

@FindBy(name = "login")
private WebElement login;

// getters penetrate
public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}



}
