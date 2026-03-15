package com.BookFlight.pom;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	By roundTripButton= By.xpath("//li[@data-cy='roundTrip']");
	By sourceCity = By.id("fromCity");
	By sourceSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
	By destinationCity = By.id("toCity");
	By destinationSearchBox = By.xpath("//input[@aria-controls='react-autowhatever-1']");
	By searchButton = By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn']");
	By close = By.xpath("//span[@class='commonModal__close']");
	
	//Action methods
	
	public void closePopUp() throws InterruptedException {		
		driver.findElement(close).click();
	}
	
	public void clickRoundTripButton() throws InterruptedException{
		driver.findElement(roundTripButton).click();		
	}
	
	public void enterSourceCity(String fromCity) throws InterruptedException {
		driver.findElement(sourceCity).click();
		driver.findElement(sourceSearchBox).sendKeys(fromCity);	
		driver.findElement(By.xpath("//span[contains(text(),'"+fromCity+"')]")).click();
	}
	
	public void enterDestinationCity(String toCity) throws InterruptedException {
		driver.findElement(destinationCity).click();
		driver.findElement(destinationSearchBox).sendKeys(toCity);
		driver.findElement(By.xpath("//span[contains(text(),'"+toCity+"')]")).click();
	}
	
	public void selectDepartureDate() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,110)","");
		driver.findElement(By.xpath("//div[@aria-label='Sat Mar 28 2026']")).click();
		
	}
	
	public void selectReturnDate() {
		driver.findElement(By.xpath("//div[@aria-label='Thu Apr 02 2026']")).click();
	}
	
	public void clickSearchButton() {
		driver.findElement(searchButton).click();
	}
}
