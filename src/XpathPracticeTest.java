import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathPracticeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\SeleniumJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 
		
//		driver.get("http://demo.guru99.com/test/newtours");
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		WebElement PickFromMonth = driver.findElement(By.name("fromMonth"));
		Select month = new Select(PickFromMonth);
		month.selectByValue("10");
	
		WebElement PickToMonth = driver.findElement(By.name("toMonth"));
		Select monthto = new Select(PickToMonth);
		monthto.selectByValue("10");
		
		
		
	//	driver.findElement(By.xpath("//input[@value='Business']")).click();
		
		driver.findElement(By.xpath("//*[starts-with(@value,'Bus')]")).click();
		
		
		
		
		

	}

}
