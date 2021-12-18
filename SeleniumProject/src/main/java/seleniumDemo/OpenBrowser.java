package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {

		//Open/Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		//Create object of chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		//driver.get("http://google.com");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Get Title of title
		System.out.println(driver.getTitle());
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		
		//wait/pause 5 seconds before close the browser
		Thread.sleep(5000);
		
		//Close driver
		driver.close();	
	}
}
