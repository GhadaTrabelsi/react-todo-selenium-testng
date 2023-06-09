package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.SeleniumUtils;
import com.todos.utils.Setup;



public class RemoveTodo extends Setup {
	public SeleniumUtils utils;
	public TodoPage todoPage;

	public RemoveTodo() throws IOException {
		super();
        utils = new SeleniumUtils();
		

	}
 
 @Test
 public void iRemoveToDo() throws IOException, InterruptedException{
	 
		todoPage = new TodoPage();
		utils.submitTodo(TodoPage.inputText, prop.getProperty("todo1"));
		utils.click(TodoPage.checkbox);
	//Thread.sleep(3000);
		utils.click(TodoPage.removeBTN);
		String pagesource = todoPage.getPageSource();
	     Assert.assertFalse(pagesource.contains(prop.getProperty("todo1")));
    
	 System.out.println("removed");
	 }
 }
 