import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSelectList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		List<WebElement> cate=driver.findElements(By.xpath("//*[@id='searchDropdownBox']//option"));
		System.out.println(cate.size());
		
for(WebElement option : cate) {
			
			
			System.out.println(option.getText()+"------"+option.isSelected());
			
		}
	}

}
