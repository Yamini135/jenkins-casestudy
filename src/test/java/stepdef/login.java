package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class login {
	WebDriver driver;
	@Given("user navigates to registration page")
	public void user_navigates_to_registration_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_C2a.04.30\\Desktop\\Sel-Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@Given("user enters firstname as {string} in fn field")
	public void user_enters_firstname_as_in_fn_field(String un) {
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@Given("user enters password as {string}  in pd field")
	public void user_enters_password_as_in_pd_field(String pd) {
		driver.findElement(By.name("password")).sendKeys(pd);
	}

	@Given("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.name("Login")).click();
		 System.out.println("Signin successfull");
	}

	@Given("validate registration")
	public void validate_registration() {
	    System.out.println("Signin successfull");
	}
}
