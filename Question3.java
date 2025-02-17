package task9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.wikipedia.org/");
		   WebElement searchBox = driver.findElement(By.name("search"));
	        searchBox.sendKeys("Artificial Intelligence");
	        searchBox.sendKeys(Keys.RETURN);
	        Thread.sleep(2000);
	        WebElement historySection = driver.findElement(By.linkText("History"));
	        historySection.click();
	        Thread.sleep(2000); 
	        System.out.println("Section Title: " + driver.findElement(By.id("History")).getText());
	        driver.quit();
	} 

}
  