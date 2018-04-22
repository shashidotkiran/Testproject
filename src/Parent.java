import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello World!");
		
		//WebDriver driver = new SafariDriver();
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		 // driver.findElement(By.name("q")).sendKeys("name");
		  driver.findElement(By.id("lst-ib")).sendKeys("India");
		  driver.findElement(By.id("doc-info")).click();
		  driver.findElement(By.name("btnk")).click();
		
		  
		
	}

}
