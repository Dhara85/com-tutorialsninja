package com.tutorialsninja.demo.steps;


import com.tutorialsninja.demo.propertyreader.PropertyReader;
import com.tutorialsninja.demo.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Utility {
    @Before // Before and after method always select from cucumber otherwise testcase will not run
    public void setUp(){
       selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){ // ! before scenario if u want to use only pass scenario
            final byte [] screenshot = getScreenShot();
            scenario.attach(screenshot,"image/png", scenario.getName());//scenario is variable from method Scenario scenario, image can be jpg,impeg,png etc.
        } // u can add else if req. for pass
        closeBrowser();
    }
}
