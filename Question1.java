package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        WebDriver driver = new FirefoxDriver();

        // Maximize the window
        driver.manage().window().maximize();
 
        // Navigate to Google
        driver.get("http://google.com");
 
        // Print the current URL
     
        System.out.println("Current URL: " + driver.getCurrentUrl());
 
        // Reload the page
        driver.navigate().refresh();

        driver.quit();
	

	}

}
