package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demowebshop 
{
	WebDriver driver;
	@Given("user launched the home page of demowebshop site")
	public void user_launched_the_home_page_of_demowebshop_site() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bindu\\Desktop\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.findElement(By.className("ico-login")).click();
	}

	@When("user provides valid email as{string}")
	public void user_provides_valid_email_as(String email)
	{
	   driver.findElement(By.id("Email")).sendKeys(email);
	}

	@When("user provides valid password as{string}")
	public void user_provides_valid_password_as(String password) 
	{
	   driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		driver.findElement(By.className("button-1 login-button")).click();
	}

	@Then("user shall be able to view the homepage with welcome message on top right of page along with his name")
	public void user_shall_be_able_to_view_the_homepage_with_welcome_message_on_top_right_of_page_along_with_his_name() 
	{
	   System.out.println("sucessful login");
	   driver.get("http://demowebshop.tricentis.com/");
	   driver.findElement(By.className("ico-login")).click();
	}

}
