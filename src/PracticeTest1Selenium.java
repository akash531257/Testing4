import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTest1Selenium {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\SeleniumJars\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver(); 
		
		driver.get("https://www.instagram.com");
		Thread.sleep(4000);
		//driver.findElement(By.cssSelector("input[name='username']")).sendKeys("akash24233434");//This is Working
		//driver.findElement(By.cssSelector("input.zyHYP")).sendKeys("class_css_selector");//This is Working
		
		driver.findElement(By.name("username")).sendKeys("akashsddsfdsf");
		driver.findElement(By.name("password")).sendKeys("lkaaffssadad");
		
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}
}
