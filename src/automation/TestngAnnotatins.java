package automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotatins {

	

		@BeforeSuite   
				
		public void SetUp() {
			
			System.out.println("Setup method is for chrome or any browser ");
				
		}
		
		@BeforeTest
		public void launchbrowser() {	
			System.out.println("launch browser ");
		}
	
		@BeforeClass
		
		public void logintoapplication() {		
			System.out.println("logintoapplication ");
			
		}
		
		@BeforeMethod
		
		public void enterurl() {
			System.out.println("enterurl ");
					
		}
		
		
		@Test
		
	public void nameofthepagetitle() {	
			System.out.println("getpagetitle ");
		}
		
		
		@AfterMethod
		
		public void logoutfromtheapplication() {
			System.out.println("logoutfromapplication ");
		}
		
		
		@AfterClass
		
		public void closebrowser() {
			System.out.println("close browser");
		}
		
		
		@AfterTest
		
		public void deletecachecookiesanything() {
			System.out.println("deletecookies");
	
		}




	}


