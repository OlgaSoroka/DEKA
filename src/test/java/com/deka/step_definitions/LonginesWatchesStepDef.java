package com.deka.step_definitions;

import com.deka.utilities.utilities.ConfigurationReader;
import com.deka.utilities.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LonginesWatchesStepDef {

    @Given("go to the web page")
    public void go_to_the_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user click on the watch {string}")
    public void user_click_on_the_watch(String string) {

    }
    @When("user click Longines {string}")
    public void user_click_longines(String string) {

    }
    @Then("the user is able to see {string}")
    public void the_user_is_able_to_see(String string) {

    }

}
