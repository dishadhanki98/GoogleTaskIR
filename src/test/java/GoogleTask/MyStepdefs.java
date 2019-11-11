package GoogleTask;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs extends Utils
{
    LoadProps loadProps=new LoadProps();
    HomePage homePage=new HomePage();
    @Given("^user is on home page$")
    public void userIsOnHomePage()
    {
      assertURLText("google");
    }

    @When("^user enter misspelled keyword$")
    public void userEnterMisspelledKeyword()
    {
        homePage.enterSearchBar();
    }

    @And("^click on search button$")
    public void clickOnSearchButton()
    {
     homePage.clickSearchBar();
    }

    @Then("^User should get Search instead option$")
    public void userShouldGetSearchInsteadOption()
    {
        System.out.println(driver.findElement(By.id("fprsl")).getText());

        Assert.assertFalse(driver.findElement(By.id("fprsl")).getText().equals(loadProps.getProperty("textsearchbar")));


    }
}
