import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTest2Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver(); 
		driver.get("http://demo.guru99.com/v4/manager/addcustomerpage.php");
		
		driver.findElement(By.name("name")).sendKeys("Akash");
		driver.findElement(By.cssSelector("input[value='f']")).click();
		
		driver.findElement(By.id("dob")).sendKeys("");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("123 Toronto Street");
		
		
		driver.quit();
		
		System.out.println("Akash");
	}

}
