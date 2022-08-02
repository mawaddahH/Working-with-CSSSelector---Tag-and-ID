package ass1W9D3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeWebDriverAss1W9D3 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */

	@BeforeTest
	public void setUp() throws InterruptedException {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		System.out.println(driver.getTitle());
	}

	/**
	 * Test TextField using cssSelector Tag and ID
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// Find firstName TextField by Tag and Attribute
		WebElement firstName = driver.findElement(By.cssSelector("input[aria-label='First name']"));
		firstName.sendKeys("Mawaddah");
//		Thread.sleep(2000);
		
		// Find lastName TextField by Tag and Attribute
		WebElement lastName = driver.findElement(By.cssSelector("input[aria-label='Last name']"));
		lastName.sendKeys("Hanbali");
//		Thread.sleep(2000);
		
		// Find email TextField by Tag and Attribute
		WebElement email = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		email.sendKeys("Mawadah@text.com");
//		Thread.sleep(2000);
		
		// Find password TextField by Tag and ID
		WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
		password.sendKeys("Mawadah@text.com");
//		Thread.sleep(2000);
		
		// Find email re-enter TextField by Tag and Attribute
		WebElement reEnterEmail = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
		reEnterEmail.sendKeys("Mawadah12@text.com");
//		Thread.sleep(2000);
		
		
		// Find monthBirthday by Tag and ID
		WebElement monthBirthday = driver.findElement(By.cssSelector("select#month"));
		monthBirthday.sendKeys("Apr");
//		Thread.sleep(2000);
		
		
		// Find dayBirthday TextField by Tag and ID
		WebElement dayBirthday = driver.findElement(By.cssSelector("#day"));
		dayBirthday.sendKeys("1");
//		Thread.sleep(2000);
		
		
		// Find yearBirthday TextField by Tag and ID
		WebElement yearBirthday = driver.findElement(By.cssSelector("#year"));
		yearBirthday.sendKeys("2000");
//		Thread.sleep(2000);
		
		
		// Find password TextField by Tag and Attribute
		WebElement gender = driver.findElement(By.cssSelector("input[class='_8esa']"));
		gender.click();
//		Thread.sleep(2000);
		
		// Find SignUp button by Tag and Attribute
		WebElement signUp = driver.findElement(By.cssSelector("button[name='websubmit']"));
		signUp.click();
//		Thread.sleep(2000);
		
	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
