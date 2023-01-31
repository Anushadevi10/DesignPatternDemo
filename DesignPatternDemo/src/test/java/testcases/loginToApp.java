package testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import pages.Hotel_app_login_page;


public class loginToApp {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		Hotel_app_login_page happ = new Hotel_app_login_page (driver);
		happ.enterUserName("Anusha10");
		happ.enterPassword("Anusha10");
		happ.clickLogin();
		
		
	}
}
