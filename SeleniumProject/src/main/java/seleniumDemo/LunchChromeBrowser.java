package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();

//implicitly wait
driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);

//Get title of the page
System.out.println(driver.getTitle());

//Enter username
driver.findElementById("username").sendKeys("DemoSalesManager");
//driver.findElementById("username").sendKeys("DemoSalesManager");

//Enter password
driver.findElementById("password").sendKeys("crmsfa");

//Click login
driver.findElementByClassName("decorativeSubmit").click();

//


	}

}
