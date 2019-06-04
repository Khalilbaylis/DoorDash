package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUpPage {
    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[@class='sc-eNQAEJ fOksxD' and contains(text(), 'Sign Up')]")
    public static WebElement HomePageSignUpButton;
    @FindBy(name ="First name")
    public static WebElement firstName;
    @FindBy(name="Last name")
    public static WebElement lastName;
    @FindBy(name="Email")
    public static WebElement email;
    @FindBy(name="Password")
    public static WebElement password;
    @FindBy(id="Mobile number")
    public static WebElement phoneNumber;
    @FindBy(xpath="//button[@type='submit']")
    public static WebElement signUp;
    @FindBy(xpath="//button[contains(text(),'Sign in')]")
    public WebElement signIn;
    @FindBy(linkText="Terms and Conditions")
    public WebElement termsandconditions;
    @FindBy(linkText="Privacy Statement")
    public WebElement privacyStatement;
    @FindBy(xpath="//button[@data-test-id='facebook-create-button']")
    public WebElement fbbutton;
    @FindBy(xpath="//*[contains(@class, \"Login_buttonGoogle\")]")
    public WebElement googleButton;








}

