package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
public static WebDriver driver;
PageObject object;
@Given("I need to go the valid application site")
public void i_need_to_go_the_valid_application_site() {
	System.setProperty("webdriver.chrome.driver","C:\\shweta\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	object= new PageObject(driver);
	driver.manage().window().maximize();
	
}

@When("I entered valid username and password correct")
public void i_entered_valid_username_and_password_correct() {
	object.enter_name();
	object.enter_pass();
}

@And("If i entered the wrong username and password details it will pop up the invalid unsername password message")
public void if_i_entered_the_wrong_username_and_password_details_it_will_pop_up_the_invalid_unsername_password_message() {
	//driver.findElement(By.name("Login")).click();
	
	object.clickok();
	
}

@Then("I have logged in successfully")
public void i_have_logged_in_successfully() {
  driver.close();
}


}
