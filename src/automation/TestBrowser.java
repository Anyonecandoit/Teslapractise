package automation;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBrowser {
	
	
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable  {
		
	//	System.setProperty("webdriver.chrome.driver", " ");
		

		
		
		//data types : int , string , float , double , long float  double int  , char , boolean
		
		//wrapper classes <Integer  , 3> , <String , 3>  , <object,ant20>
		
		
		
		
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 driver.manage().timeouts().implicitlyWait(40000, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		String	element = driver.getTitle();
		
		
		System.out.println("The name of the page is " + element);
		
	WebElement t = 	driver.findElement(By.xpath("//input[@name=\"username\"]"));
	System.out.println(" i am passing  the username  " );
	t.sendKeys("Admin");
	t.clear();

	WebElement x =	driver.findElement(By.name("password"));
	System.out.println(" i am passing  the password  " );
	x.sendKeys("admin123");
	x.clear();
	
	
	// System.out.println(" i am clicking the button   " );
	// driver.findElement(By.xpath("//button[@class = \"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	
	System.out.println(" navigating to homepage   " );
	
		
	}
		

		
		


	}


