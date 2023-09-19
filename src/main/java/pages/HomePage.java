package pages;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// we have to write this manually
import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// it will show Null Pointer Exception if Pagefactory is not instantiate
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".logo.pull-left")
	WebElement clickLogo;

	// used it to shoe common action method
	@FindBy(css = ".fa.fa-lock")
	WebElement clickSignupLoginButton;

	@FindBy(xpath = "//input[contains(@data-qa, 'signup-name')]")
	WebElement clickNewUserName;

	@FindBy(xpath = "//input[contains(@data-qa, 'signup-email')]")
	WebElement clickNewUserEmail;
	
	@FindBy(xpath = "//button[@class = 'btn btn-default' and text() = 'Signup']")
	WebElement clickSignupButton;

	public void clickLogo() throws InterruptedException {
		clickLogo.click();
		Thread.sleep(2000);
	}

	public void clickLoginButton() throws InterruptedException {
		clickElement(clickSignupLoginButton);
		Thread.sleep(2000);
	}

	public void clickNewUserName() throws InterruptedException {
		clickElement(clickNewUserName);
		Thread.sleep(2000);
	}
	
	public void clickNewUserEmail() throws InterruptedException {
		clickElement(clickNewUserEmail);
		Thread.sleep(2000);
	}

//	public void InputNewUserName() throws InterruptedException {
//		clickNewUserName.sendKeys("Sieee");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}

	public void InputNewUserNameAndEmailThenClickSignupButton() throws InterruptedException {
		inputText(clickNewUserName, "sieeee");
		Thread.sleep(2000);
		inputText(clickNewUserEmail, "sieeee@gmil.com");
		Thread.sleep(2000);
		clickElement(clickSignupButton);
		Thread.sleep(2000);
	}

}
