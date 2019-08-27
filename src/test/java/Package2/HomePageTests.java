package Package2;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BasePage;
import Package1.HomePageObjects;

public class HomePageTests {
	HomePageObjects hp;
	BasePage bp;
	
	int random=new Random().nextInt(500000);
	String email="nivetha2296" + random + "@gmail.com";
	
	public HomePageTests() {
		hp = new HomePageObjects();
		bp = new BasePage();
	}
	
   @Test
   public void verifyTabs()
   {
	   Assert.assertTrue(bp.elementFound(hp.getWomen()));
	   Assert.assertTrue(bp.elementFound(hp.getDresses()));
	   Assert.assertTrue(bp.elementFound(hp.gettshirts()));
   }
   
  
   
  
   
   @Test
   public void verifyNavigation()
   {
	  hp.clickWomen();
	  String msg=hp.getTitleWomen();
	  Assert.assertTrue(msg.equals("WOMEN - My Store"), "Failed:Women not displayed");
	  
	  hp.clickDresses();
	  String msg1=hp.getTitleDresses();
	  Assert.assertTrue(msg1.equals("DRESSES - My Store"), "Failed:Dresses not displayed");
	  
	  hp.clickTshirts();
	  String msg2=hp.getTitleTshirts();
	  Assert.assertTrue(msg2.equals("T-SHIRTS - My Store"), "Failed:Tshirts not displayed");
   }
   
  
   
  
   
   @Test
   public void verifySubscription()
   {
	   hp.setNewsLetter(email);
	   String msg=hp.getTxtNewsletterMessage();
	   Assert.assertTrue(msg.contains("successful"), "Failed:Subscription message is not displayed");
   }
}


