package com.BookFlight.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BookFlight.pom.HomePage;

public class TestCases {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchChromeBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-infobars");
	    options.addArguments("--start-maximized");
	    options.addArguments(
	    		"--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/145.0.0.0 Safari/537.36"
	    		);
		driver  = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='80%'");

	}
	
	@Test
	public void searchFlightTickets() throws InterruptedException {
		HomePage homepage = new HomePage(driver);
 		homepage.closePopUp();
 		Thread.sleep(2000);
 		driver.findElement(By.tagName("body")).click();
 		homepage.clickRoundTripButton();
 		homepage.enterSourceCity("Pune");
 		homepage.enterDestinationCity("Hyderabad");
 		homepage.selectDepartureDate();
 		homepage.selectReturnDate();
 		homepage.clickSearchButton();
 		
	}
	

}
