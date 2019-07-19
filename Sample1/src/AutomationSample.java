


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;


public class AutomationSample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Chrome//chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='login-signup']")).click();
        Select oslect=new Select(driver.findElement(By.id("usernamereg-month")));
        List <WebElement> element=oslect.getOptions();
  
        for(int i=1;i<element.size();i++){
        	System.out.println(element.get(i).getText());
        	if("March".equals(element.get(i).getText())){
        		element.get(i).click();
        		break;
        	}
        	
        }
        
        Select oday=new Select(driver.findElement(By.id("usernamereg-day")));
        List <WebElement> d=oday.getOptions();
  
        for(int i=1;i<d.size();i++){
        	System.out.println(d.get(i).getText());
        	if("28".equals(d.get(i).getText())){
        		d.get(i).click();
        		break;
        	}
        	
        }
    
        Select oyear=new Select(driver.findElement(By.id("usernamereg-year")));
        List <WebElement> y=oyear.getOptions();
  
        for(int i=1;i<y.size();i++){
        	System.out.println(y.get(i).getText());
        	if("1982".equals(y.get(i).getText())){
        		y.get(i).click();
        		break;
        	}
        	
        }
        
        
        driver.findElement(By.id("usernamereg-freeformGender")).sendKeys("Male");
  
        
//        Select sc= new Select(driver.findElement(By.name("mm")));
//        for(int i=1;i<1;i=i+1){
//        	System.out.println(sc.getOptions().get(i).getText());
//        }
////        WebElement select=driver.findElement(By.id("usernamereg-month"));
////        List <WebElement> options=select.findElements(By.tagName("option"));
////       System.out.println( options.size());
//    
//       sc.selectByVisibleText("December");
//       for (WebElement scs : options) {
//    	   System.out.println(scs.getText());
//    	   if ("January".equals(scs.getText().trim()))
//    		   scs.click();
//    	       break;
//         }     
//       
//       WebElement day=driver.findElement(By.name("dd"));
//       List <WebElement> days=day.findElements(By.tagName("option"));
//       System.out.println(days.size());
//      
//      for (WebElement d:options) {
//   	   if ("28".equals(d.getText().trim()))
//   		   d.click();
//   	       break;
//      }
       
//      WebElement year=driver.findElement(By.name("yyyy"));

       
	}   
      
    }
       



