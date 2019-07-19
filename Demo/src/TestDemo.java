import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.wikipedia.org");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@title='English � Wikipedia � The Free Encyclopedia']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("searchInput")).sendKeys("software");
		driver.findElement(By.id("searchButton")).submit();
        Thread.sleep(5000);
        driver.quit();
	}

}
