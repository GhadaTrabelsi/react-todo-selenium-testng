package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='What needs to be done?']")
	public static WebElement inputText;
	
	@FindBy(how = How.XPATH, using = "//li[@class='ng-scope']//label[@class='ng-binding']")
	public static WebElement todoText;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='todo.completed']")
	public static WebElement checkbox;
	@FindBy(how = How.XPATH, using = "//button[@class='clear-completed']")
	public static WebElement removeBTN;
	
     public String getPageSource() {
        String element = driver.getPageSource();
        return element;
    }
	

	

}
