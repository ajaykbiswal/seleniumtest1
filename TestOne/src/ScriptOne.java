import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ScriptOne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://yahoo.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		//driver.findElement(By.id("usernamereg-firstName")).sendKeys("AJAY");
		//driver.findElement(By.id("usernamereg-lastName")).sendKeys("bISWAL");
		Select oslect=new Select(driver.findElement(By.id("usernamereg-month")));
		List <WebElement> oelement=oslect.getOptions();
		  for(int i=1;i<oelement.size(); i++){
			System.out.println(oelement.get(i).gettext());  
		  }
		  
		
	

	}

}
