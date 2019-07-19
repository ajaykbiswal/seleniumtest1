import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.quikr.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("hSelectCity")).click();
		  //Thread.sleep(2000);
		  List <WebElement> linkc=driver.findElements(By.xpath("//div[@id='hCityList']/ul/li"));
	      System.out.println(linkc.size());
	      for(int i=1;i<=linkc.size()-1;i=i+1)
	        {
	            //System.out.println(linkc.get(i).getText());
	            if(linkc.get(i).getText().equals("Hyderabad"))
	            {
	      	    linkc.get(i).click();
	      	    break;
	      	   //driver.findElement(By.linkText("Real Estate")).click();   
	            }   
	        }
		Thread.sleep(3000);
		driver.findElement(By.id("searchedCat")).click();
        List <WebElement> links=driver.findElements(By.xpath("//div[@id='category-dropdown']/ul/li"));
        System.out.println(links.size());
        for(int i=1;i<=links.size()-1;i=i+1)
          {
              //System.out.println(links.get(i).getText());
              if(links.get(i).getText().equals("Real Estate"))
              {
        	    links.get(i).click();
        	    break;
        	  
        	    }   
                 
           }
        
//        WebDriverWait wait=new WebDriverWait(driver,10);
//        WebElement msgElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.className("quikr-dropdown-wrap")));
//        String message=msgElement.getClass()
//        
        Thread.sleep(1000);
        driver.findElement(By.id("query")).sendKeys("2BK");
        driver.findElement(By.id("submitSearch")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("quikr-dropdown-wrap")).click(); 
       
        
        
        
        
        
        }
    
	}

