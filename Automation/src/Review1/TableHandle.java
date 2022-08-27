package Review1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","libs/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/mellu/eclipse-workspace/Automation/src/Review1/table.html");

	}

}
