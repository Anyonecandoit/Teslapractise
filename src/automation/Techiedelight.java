package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techiedelight {

	public static void main(String[] args) {




		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.techiedelight.com/");
		
		driver.manage().timeouts().implicitlyWait(50000 ,TimeUnit.SECONDS);
	List<WebElement>	li = driver.findElements(By.tagName("a"));

	
	int licount = li.size();
	
	System.out.println("i am printing the count of total number of elements with tagname  "+ licount);
	
	for(int i=0 ;i<li.size();i++) {
		
		System.out.println(li.get(i).getText());
		
	}
	
	}

}
