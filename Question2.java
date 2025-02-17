package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com");
		
		String expectidTitle = "STORE";
		if(driver.getTitle().equals(expectidTitle)) {
			System.out.println("Page landed on correct website");
		}
		else {
			System.out.println("Page not landed on correct website");
		}
  
		driver.close();	

	} 

}

//output
//Page landed on correct website
