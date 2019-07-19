import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.wikipedia.org");
		String acttitle=driver.getTitle();
		String Expected_title="Wikipedia";
		Assert.assertEquals(acttitle, Expected_title);
		Assert.assertTrue(acttitle.contains(Expected_title), "Expected Link -Presented");
		driver.findElement(By.id("js-link-box-en")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Software");
		driver.findElement(By.id("searchButton")).submit();
		String strTitle=driver.getTitle();
		String Exp_Title="Software - Wikipedia";
		//System.out.println(strTitle);
		Assert.assertEquals(strTitle, Exp_Title);
		Assert.assertTrue(strTitle.contains(Exp_Title), "Expected Page-Loaded!");
		driver.quit();
		

	}

}
