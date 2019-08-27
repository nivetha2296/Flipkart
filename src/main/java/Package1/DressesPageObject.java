package Package1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DressesPageObject extends BasePage{
	public DressesPageObject() {
		PageFactory.initElements(driver,this);
		
		}
	@FindBy(xpath="//a[text()='S']")
	WebElement txtSizeS;
	@FindBy(xpath="//a[text()='M']")
	WebElement txtSizeM;
	@FindBy(xpath="//a[text()='L']")
	WebElement txtSizeL;
	
	
	
	
	@FindBys(@FindBy(xpath = "//span[text()='Size']/parent::div/following-sibling::ul/li"))
		List <WebElement> sizeCheckBox;

		@FindBy(xpath = "//span[text()='There are 5 products.']")
		WebElement txtProductCountHeading;

		@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
		List <WebElement> productCount;
		
		public WebElement getSizeS() {
		    return txtSizeS;
			}
			public WebElement getSizeM() {
			return txtSizeM;
			}
			public WebElement getSizeL() {
			return txtSizeL;
			}
		

		public void checkSize() {
		for (WebElement check:sizeCheckBox) {
		check.click();
		}
		}

		public   int getProductCount() {
		return productCount.size();
		}

		public int getProductCountFromHeading() {
		/*String txt = txtProductCountHeading.getText();
		String[] txtSplit = txt.split(" ");
		String txtcount = txtSplit[2];
		int headingProductCount = Integer.parseInt(txtcount);
		return headingProductCount;*/

		return Integer.parseInt(txtProductCountHeading.getText().split(" ")[2]);    //simple way

		}
		public void close() {
			// TODO Auto-generated method stub
			
		}
		public String getTxtCart() {
			// TODO Auto-generated method stub
			return null;
		}
		public void moveToProductOne() {
			// TODO Auto-generated method stub
			
		}

		}

	
	
	


