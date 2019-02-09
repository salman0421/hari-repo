package csspath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lab1");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("Test case passed");
		}
		else{
			System.out.println("Test case failed");
		}
		
		
		driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).click();
		
				
		driver.close();
	}


	}
