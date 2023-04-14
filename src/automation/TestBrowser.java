package automation;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestBrowser {
	
	
	

	public static void main(String[] args) throws Throwable  {
		
	//	System.setProperty("webdriver.chrome.driver", " ");
		

		
		
		//data types : int , string , float , double , long float  double int  , char , boolean
		
		//wrapper classes <Integer  , 3> , <String , 3>  , <object,ant20>
		
		
		
		
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String	element = driver.getTitle();
		System.out.println("The name of the page is " + element);
		
		
		
		String	element1 =	driver.getCurrentUrl();
		
		System.out.println("The name of the page is " + element1);
		
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
		
		driver.quit();
		
	

	
		
	}
		

		
		


	}


