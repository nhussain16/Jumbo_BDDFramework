package com.qa.util;

import org.openqa.selenium.By;

public class UIControlIds {

	public static By headerSearch = By.id("header-search");
	public static By headerSearchBtn = By.xpath("(//button[@data-x=\"submit\" and text()='Zoeken'])[1]");
	public static By JobCount = By.cssSelector(".colorScheme--contrast>.colorScheme-accent");
	public static By invalidSearchContains = By
			.xpath("//div[contains(text(),'Helaas! We hebben geen vacatures gevonden.')]");
	public static By clearSearchField = By.xpath("//button[@data-x=\"reset\"])[2]");
	public static By jobDetailLink = By.cssSelector(".VacatureCard.colorScheme-border>a");
	public static By officeBranch = By.xpath("//a[@data-x='link-to-office']");
	public static By officeLocation = By.cssSelector("ul[class='VacaturedetailOtherHero-details']>li:nth-of-type(2)");
	public static By hoursPerWeek = By.cssSelector("ul[class='VacaturedetailOtherHero-details']>li:nth-of-type(3)");
	
	public static By browserCookiesId = By.xpath("//div[@id='onetrust-group-container']");
	public static By acceptCookiesBtn= By.xpath("//button[text()='Akkoord']");
}