import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;


public class FirefoxDriverGuru99Day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\SeleniumJars\\geckodriver.exe" );
		
		
		WebDriver driver = new FirefoxDriver();
		
		String baseURL="http://demo.guru99.com/V4/";
		
		driver.get(baseURL);  // This line used for open a browser with particular website.
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.name("uid"));
		username.sendKeys("mngr373551");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("hetEnUp");
		
		driver.findElement(By.name("btnLogin")).click();
		
		String ExpectedTitle="Guru99 Bank Manager HomePage";
		
		String ActualTitle=driver.getTitle();
		
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
		}
		 
		 
		 
		 
		

	}

}
