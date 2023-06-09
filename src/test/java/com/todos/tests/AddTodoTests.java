package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.SeleniumUtils;
import com.todos.utils.Setup;

public class AddTodoTests extends Setup {
	public SeleniumUtils utils;

	public AddTodoTests() throws IOException {
		super();
		utils = new SeleniumUtils();

	}
	
	TodoPage todoPage;
	
	@Test(priority = 1)
	public void iCanAddTodo() throws IOException {
		todoPage = new TodoPage();
		boolean todoField = utils.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(todoField);
		utils.submitTodo(TodoPage.inputText, prop.getProperty("todo1"));
		utils.checkElementContain(TodoPage.todoText);
		utils.assertTrue(TodoPage.todoText, prop.getProperty("todo1"));

		boolean checkbox =utils.isCheckboxSelected(TodoPage.checkbox);

		utils.assertFalse(checkbox);
		
	}
}
