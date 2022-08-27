package Review1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","libs/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");

       //  driver.quit();
    }
}