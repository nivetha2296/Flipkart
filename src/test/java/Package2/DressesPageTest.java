package Package2;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BasePage;
import Package1.DressesPageObject;
import Package1.HomePageObjects;

public class DressesPageTest {

	DressesPageObject dp;
	HomePageObjects hp;
	BasePage bp;

@Test
public void verifyIcons()
{  
	hp.clickDresses();
	    Assert.assertTrue(bp.elementFound(dp.getSizeS()));
	    Assert.assertTrue(bp.elementFound(dp.getSizeM()));
	    Assert.assertTrue(bp.elementFound(dp.getSizeL()));
	  
	    
}

@Test
public void verifyProductCount()
{
	 hp.clickDresses();
	 Assert.assertTrue(dp.getProductCount()== dp.getProductCountFromHeading(), "Failed:Count mismatched");
	 
}

@Test
public void verifyAddToCart()
{
	hp.clickDresses();
	dp.moveToProductOne();
	String msg=dp.getTxtCart();
	Assert.assertTrue(msg.contains("added"), "Failed:Product not added to cart");
	dp.close();

}


}
