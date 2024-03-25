package org.travels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseMethod{
public LoginPage() {
PageFactory.initElements(driver,this);
}

@FindBy(id="src")
private WebElement from;

@FindBy(id="dest")
private WebElement to;

@FindBy(id="onward_cal")
private WebElement date2;

public WebElement getDate2() {
	return date2;
}

@FindBy(xpath="//td[@class='current day']")
private WebElement date;

@FindBy(id="search_btn")
private WebElement searchbtn;

@FindBy(xpath="//li[@data-id='66337']")
private WebElement fromto;

@FindBy(xpath="//a[text()='redbus']")
private WebElement redbus;

public WebElement getRedbus() {
	return redbus;
}

public WebElement getFromto() {
	return fromto;
}

public WebElement getSearchbtn() {
	return searchbtn;
}

public WebElement getFrom() {
	return from;
}

public WebElement getTo() {
	return to;
}

public WebElement getDate() {
	return date;
}























































}
