import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/almaz/Downloads/chromedriver2");
		WebDriver driver = new ChromeDriver();
		
		//Traverse forward by following sibling
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String text = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(text);//Login
		
		//Traverse back by parent xpath
		String text1 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		System.out.println(text1);//Login
		driver.close();
	}

}
