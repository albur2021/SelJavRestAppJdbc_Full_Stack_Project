import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/almaz/Downloads/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");//Selenium will wait all page fully loaded
		driver.navigate().to("https://rahulshettyacademy.com");//Selenium will not wait just get some component, you have put explicitly wait'
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
