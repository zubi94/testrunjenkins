package protraining.testrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createaccount {
	WebDriver driver;
	
	@FindBy(xpath = "//*[contains(@class,'styles__AccountName-sc-1kk0q5l-0 eaqGge')]")
	WebElement sighnmenue;
	@FindBy(linkText = "Create account")
	WebElement newacc;
	@FindBy(id = "username")
	WebElement aemail;
	@FindBy(id = "firstname")
	WebElement fname1;
	@FindBy(id = "lastname")
	WebElement lname;
	@FindBy(id = "phone")
	WebElement phone1;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(xpath = "(//*[@for='keep-me-signed-in'])[1]")
	WebElement optionclick;
	@FindBy(linkText = "Create account")
	WebElement create;
	
	
	public createaccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	public void menu(){
		sighnmenue.click();
	}
	public void n_acc() {
		newacc.click();
	}
	public void user(String email){
		aemail.sendKeys(email);
	}
	public void firstname(String fnam) {
		fname1.sendKeys(fnam);
	}
	public void last(String lnam) {
		lname.sendKeys(lnam);
	}
	public void phone(String ph) {
		phone1.sendKeys(ph);
	}
	public void psd(String ps) {
		password.sendKeys(ps);
	}
	public void read() {
		optionclick.click();
	}
	public void submit() {
		create.click();
	}
}
