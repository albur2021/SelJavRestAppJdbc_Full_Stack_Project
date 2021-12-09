import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/almaz/Downloads/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticSelectorTag = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticSelectorTag);
		dropdown.selectByIndex(3);
		String dropText = dropdown.getFirstSelectedOption().getText();
		System.out.println(dropText);
        dropdown.selectByVisibleText("AED");
		String dropText1 = dropdown.getFirstSelectedOption().getText();
		System.out.println(dropText1);
		dropdown.selectByValue("INR");
		String dropText2 = dropdown.getFirstSelectedOption().getText();
		System.out.println(dropText2);
	}

}
