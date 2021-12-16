import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromedriverTestGuru99 {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\SeleniumJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
String baseUrl = "http://demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);


	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr373551");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("hetEnUp");
   
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
	    
	    
	}
}
