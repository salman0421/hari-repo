package csspath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("qaplanet1");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("lab1");
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
		if(driver.getTitle().equals("OrangeHRM")){
			System.out.println("Test case passed");
		}
		else{
			System.out.println("Test case failed");
		}
		
		Thread.sleep(2000);

//		if(driver.getTitle().equals("OrangeehRM")){
//			System.out.println("Test case passed");
//		}
//		else{
//			System.out.println("Test case failed");
//		}
		
		driver.findElement(By.cssSelector("ul>li:nth-child(3)")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
