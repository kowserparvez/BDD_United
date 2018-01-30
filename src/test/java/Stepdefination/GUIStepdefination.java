package Stepdefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import Util.lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GUIStepdefination extends lib {
	WebDriver driver;
	@Before
	public void initialize() throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kowser\\eclipse-workspace\\united\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	sleep(driver, 2);
	driver.get("https://www.united.com");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	@Given("^User clicks on from and types airport from$")
	public void user_clicks_on_from_and_types_airport_from() {
		driver.findElement(By.id("Origin")).sendKeys("was");
		
	}
	@When("^User selects from airport$")
	public void user_selects_from_airport() throws IOException {
		findelement(driver, readproperties(driver, "from")).click();
	}
	
	@Then("^User clicks on To and types airport to$")
	public void user_clicks_on_To_and_types_airport_to() {
		driver.findElement(By.id("Destination")).sendKeys("dal");
	}
	@Then("^User selects destination airport$")
	public void user_selects_destination_airport() throws IOException {
		findelement(driver, readproperties(driver, "to")).click();
	}
	@Then("^Select Depurture date$")
	public void select_Depurture_date() throws IOException, InterruptedException {
		findelement(driver, readproperties(driver, "dd")).click();
		sleep(driver,2);
		findelement(driver, readproperties(driver, "ddate")).click();
		sleep(driver,2);
	}
	@Then("^Select Arrival date$")
	public void select_Arrival_date() throws IOException, InterruptedException {
		findelement(driver, readproperties(driver, "ad")).click();
		sleep(driver,2);
		findelement(driver, readproperties(driver, "adate")).click();
		sleep(driver,2);
	}

	@Then("^User selects number of passengers$")
	public void user_selects_number_of_passengers() throws IOException, InterruptedException {
		findelement(driver, readproperties(driver, "ts")).click();
		sleep(driver,2);
		findelement(driver, readproperties(driver, "tts")).click();
		sleep(driver,2);
	}
	@Then("^User selects cabin type$")
	public void user_selects_cabin_type() throws IOException, InterruptedException {
		Select cabin = new Select(driver.findElement(By.xpath(".//*[@id='cabinType']")));
		sleep(driver,2);
		cabin.selectByVisibleText("Business or First");
		sleep(driver,2);
	}
	@Then("^user clicks on Search$")
	public void user_clicks_on_Search() throws IOException, InterruptedException {
		findelement(driver, readproperties(driver, "search")).click();
		sleep(driver,2);
	}
	@Then("^User gets the search result$")
	public void user_gets_the_search_result() {
		System.out.println(driver.getTitle());
	}
	@After
	public void finalize() throws InterruptedException {
		driver.manage().deleteAllCookies();
		sleep(driver,5);
		driver.quit();
	}
	
	}


	