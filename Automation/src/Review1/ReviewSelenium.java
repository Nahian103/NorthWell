package Review1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReviewSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","libs/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		

		WebElement userNameTextField = driver.findElement(By.id("user-name"));
		userNameTextField.sendKeys("standard_user");

		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement sortDropDown = driver.findElement(By.className("product_sort_container"));
		Select selectObject =new Select(sortDropDown);
		selectObject.selectByValue("hilo");
        
		WebElement cart = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		cart.click();
		
			
	
	}
}
