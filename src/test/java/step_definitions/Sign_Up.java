package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SignUpPage;
import utilities.Driver;

public class Sign_Up {
    @Given("user is already on Sign Up Page")
    public void user_is_already_on_Sign_Up_Page() {
        SignUpPage.HomePageSignUpButton.click();
    }

    @When("title of sign up page is {string}")
    public void title_of_sign_up_page_is_(String expectedTitle) {
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("user enters valid {string}, {string} and {string}")
    public void user_enters_valid_and(String firstname, String lastname, String email) {
        SignUpPage.firstName.sendKeys(firstname);
        SignUpPage.lastName.sendKeys(lastname);
        SignUpPage.email.sendKeys(email);
    }


    @And("user enters {string} and {string}")
    public void i_login_using_username_and_password(String phone, String password) {
        SignUpPage.phoneNumber.sendKeys(phone);
        SignUpPage.password.sendKeys(password);
    }


    @When("user clicks on SignUp button")
    public void user_clicks_on_login_button() {
        SignUpPage.signUp.click();
    }

    @Then("Home Page should be displayed")
    public void home_Page_should_be_displayed() {

        String title = Driver.getDriver().getTitle();
        System.out.println("Home Page title ::"+ title);
        Assert.assertEquals("DoorDash Food Delivery - Delivering Now, From Restaurants Near You", title);

    }



}