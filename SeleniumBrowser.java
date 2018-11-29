package com.ibm.seleniumconcepts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBrowser
{

	public static void main(String[] args) throws InterruptedException 
	{

		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe");
		
		/*ChromeOptions opt=new ChromeOptions();
		opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	
		WebDriver driver= new ChromeDriver(opt);*/
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver1= new ChromeDriver();
		WebDriver driver2= new InternetExplorerDriver();
		driver2.get("https://magento.com/");
        
		
		
		/*WebElement myAccount = driver.findElement(By.xpath("//span[text()='Account']/ancestor::a"));
		myAccount.click();
		
		WebElement register = driver.findElement(By.xpath("//button[@type=’ button’]"));
		register.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id=’firstname’]"));
		firstName.sendKeys("Sweety");
		WebElement lasttName = driver.findElement(By.xpath("//input[@id=’lastname’]"));
		lasttName.sendKeys("Agarwal");        		
		WebElement emailAddress = driver.findElement(By.xpath("//input[@id=’email_address’]"));
		emailAddress.sendKeys("sweetaga@in.ibm.com");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id=’password’]"));
		passWord.sendKeys("autocorrect123");
		WebElement passWordconf = driver.findElement(By.xpath("//input[@id=’confirmation’]"));
		passWordconf.sendKeys("autocorrect123");
		
		WebElement tickBox = driver.findElement(By.id("agree_terms"));
		tickBox.click();*/
		}
	

}
