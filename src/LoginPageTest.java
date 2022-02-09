

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

	@Test (priority=2)
	public void TestLogin()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String url ="https://proservices-training-company.com/" ;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@class='menu-right']//a[@class='login js-show-popup'][normalize-space()='Login']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Identifiant']")).sendKeys("hamdich");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Extra08781892");
	    driver.findElement(By.xpath("//input[@value='Connexion']")).click();
	
	}
	
	@Test (priority=1)
	public void TestLoginFieled()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\extrainfo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		String url ="https://proservices-training-company.com/" ;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@class='menu-right']//a[@class='login js-show-popup'][normalize-space()='Login']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Identifiant']")).sendKeys("hamdich");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Extra");
	    driver.findElement(By.xpath("//input[@value='Connexion']")).click();
	    
	   String pass = driver.findElement(By.xpath("//input[@value='Connexion']")).getText();
	   
	    assertEquals(pass,"The password is incorrect");
	
	
	
	}
	
	
	
}
