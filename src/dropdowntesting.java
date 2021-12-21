import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowntesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\JAY SHRI KRISHNA\\Desktop\\Testing Class\\Projectfolder\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver(); 
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		List<WebElement> countrylist = driver.findElements(By.xpath("//select//option"));
		
		System.out.println(countrylist.size());
		
		for(WebElement countries : countrylist ) {
			System.out.println(countries.getText());
		}
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
		Select ss=new Select(dropdown);
		
		ss.selectByValue("ANDORRA");
	
		
		
	}

}
