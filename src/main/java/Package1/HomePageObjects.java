package Package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage{
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement Women;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses1;
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tshirts;
	
	@FindBy(xpath = "//*[@id='newsletter-input']")
	private WebElement txtBoxNewsLetter;
	
	@FindBy(xpath = "//*[@name='submitNewsletter']")
	private WebElement btnSubmitNewsLetter;
    
	@FindBy(xpath = "//*[@class='alert alert-success']")
    private WebElement txtSubscription;
	
	public HomePageObjects() {
		PageFactory.initElements(driver,this);
	}
	public WebElement getWomen() {
		return Women;
	}
	public WebElement getDresses() {
		return Dresses1;
	}
	public WebElement gettshirts()
	{
		return tshirts;
	}
	
	public void clickWomen()
	{
		Women.click();
	}
	
	public String getTitleWomen()
	{
		return Women.getText();
	}
	
	public void clickDresses()
	{
		Dresses1.click();
	}
	
	public String getTitleDresses()
	{
		return Dresses1.getText();
	}
	
	public void clickTshirts()
	{
		tshirts.click();
	}
	
	public String getTitleTshirts()
	{
		return tshirts.getText();
	}
	
	public void setNewsLetter(String email)
	{
		setText(txtBoxNewsLetter,email);
		btnSubmitNewsLetter.click();
	}
	
	public String getTxtNewsletterMessage()
	{
		return txtSubscription.getText();
	}
	
	
	
    
	

}


