package com.gator.tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webdriver.webdriver;

public class FocusToggleCukes {

	
	 WebDriver d;
		
	public FocusToggleCukes()
	{
		d = webdriver.openApp();
		webdriver.trainerLogin();
	    d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   d.findElement(By.xpath("//li[@name='curricula']")).click();
	}
	
	@Given("^I \"([^\"]*)\" on the focus toggle$")
	public void i_on_the_focus_toggle(String arg1) throws Throwable {
		 d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			d.findElement(By.xpath("//*[@id=\"focusArrow\"]")).click(); 
			
			String n = d.findElement(By.xpath("//*[@id=\"focusArrow\"]")).getText();
			if(n.equals("keyboard_arrow_down"))
			{
				assertEquals(true,true);
			}
			else
			{
				assertEquals(false, true);
			}
	}

	@Then("^a list of focus \"([^\"]*)\" should not be displayed$")
	public void a_list_of_focus_should_not_be_displayed(String arg1) throws Throwable {
		
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String display = d.findElement(By.xpath("//*[@id=\"focus\"]")).getCssValue("display");
		//System.out.println(display);
		if(display.equals("block"))
		{
			assertEquals(true, true);
		}
		else
		{
			assertEquals(false, true);
		}
	    //throw new PendingException();
	    
		d.quit();
	    }
	}

	

