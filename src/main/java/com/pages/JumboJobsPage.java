package com.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import com.qa.util.Constants;
import com.qa.util.ElementUtil;
import com.qa.util.UIControlIds;

public class JumboJobsPage {

	private ElementUtil elementUtil;
	private Logger log = LogManager.getLogger(JumboJobsPage.class);

	public JumboJobsPage(WebDriver driver) {
		this.elementUtil = new ElementUtil(driver);
	}

	public void acceptCookies() {
		try {
			elementUtil.waitForElementVisibleUsingBy(UIControlIds.browserCookiesId, Constants.DEFAULT_TIME_OUT);
			log.info("Access Jumbo jobs page");
			elementUtil.doActionsClick(UIControlIds.acceptCookiesBtn);
			log.info("Accept cookies button from browser popup");
		} catch (NoSuchElementException e) {
			log.error("All cookies popup screen not appeared", e.fillInStackTrace());
		}
	}

	public String getJobsDetailPageTitle() {
		String pageTitle = null;
		try {
			System.out.println("Getting page title from Jobs detail screen");
			pageTitle = elementUtil.waitForTitleIs(Constants.JOBS_DETAIL_PAGE_TITLE, Constants.DEFAULT_TIME_OUT);
			log.info("Get app tester job detail screen title...");
		} catch (NoSuchElementException e) {
			log.error("Title is not matched...", e.fillInStackTrace());
		}
		return pageTitle;
	}

	public void SearchJob(String job) {
		try {
			System.out.println("Search job " + job);
			if (job.equals("App tester")) {
				elementUtil.waitForElementVisibleUsingBy(UIControlIds.headerSearch, Constants.DEFAULT_TIME_OUT);
				elementUtil.doSendKeys(UIControlIds.headerSearch, "App Tester");

				elementUtil.waitForElementVisibleUsingBy(UIControlIds.headerSearchBtn, Constants.DEFAULT_TIME_OUT);
				elementUtil.doClick(UIControlIds.headerSearchBtn);
				log.info("Search app tester in search field from website header...");
			} else {
				elementUtil.waitForElementVisibleUsingBy(UIControlIds.headerSearch, Constants.DEFAULT_TIME_OUT);
				elementUtil.doSendKeys(UIControlIds.headerSearch, "invalid");

				elementUtil.waitForElementVisibleUsingBy(UIControlIds.headerSearchBtn, Constants.DEFAULT_TIME_OUT);
				elementUtil.doClick(UIControlIds.headerSearchBtn);
				log.info("Search invalid in search field from website header...");
			}

		} catch (NoSuchElementException e) {
			log.error("Search text field at website header have problem...", e.fillInStackTrace());
		}
	}

	public String searchedJobCountIs() {
		String jobCount = null;
		try {
			jobCount = elementUtil.waitForElementVisibleUsingBy(UIControlIds.JobCount, Constants.DEFAULT_TIME_OUT)
					.getText();
			System.out.println(jobCount);
			log.info("Searched job count is " + jobCount + "...");
		} catch (NoSuchElementException e) {
			log.error("Searched job count is not matched...", e.fillInStackTrace());
		}

		return jobCount;
	}

	public String InvalidTextSearchValidationMsg() {
		String validationtxt = null;
		try {
			elementUtil.waitForElementVisibleUsingBy(UIControlIds.invalidSearchContains, Constants.DEFAULT_TIME_OUT);
			validationtxt = elementUtil.getElement(UIControlIds.invalidSearchContains).getText();
			log.info("invalid search default text message shown...");
		} catch (NoSuchElementException e) {
			log.error("Validation message is not shown...", e.fillInStackTrace());
		}
		return validationtxt;
	}

	public void AccessJobDetails() {
		try {
			elementUtil.waitForElementVisibleUsingBy(UIControlIds.jobDetailLink, Constants.DEFAULT_TIME_OUT);
			elementUtil.doClick(UIControlIds.jobDetailLink);
			log.info("Access tester job detail link...");
		} catch (NoSuchElementException e) {
			log.error("tester job detail link not found...", e.fillInStackTrace());
		}
	}

	public String GetOfficeBranch() {
		String OfficeBranch = null;
		try {
			elementUtil.waitForElementPresence(UIControlIds.officeBranch, Constants.DEFAULT_TIME_OUT);
			OfficeBranch = elementUtil.getElement(UIControlIds.officeBranch).getText();
			log.info("Office branch " + OfficeBranch + " found...");
		} catch (NoSuchElementException e) {
			log.error("Office branch " + OfficeBranch + " not found...", e.fillInStackTrace());
		}
		return OfficeBranch;
	}

	public String GetOfficeLocation() {
		String OfficeLocation = null;
		try {
			elementUtil.waitForElementVisibleUsingBy(UIControlIds.officeLocation, Constants.DEFAULT_TIME_OUT);
			OfficeLocation = elementUtil.getElement(UIControlIds.officeLocation).getText();
			log.info("Office location " + OfficeLocation + " found...");
		} catch (NoSuchElementException e) {
			log.error("Office location " + OfficeLocation + " not found...", e.fillInStackTrace());
		}
		return OfficeLocation;
	}

	public String GetHrsPerWeek() {
		String JobHrsPerWeek = null;
		try {
			elementUtil.waitForElementVisibleUsingBy(UIControlIds.hoursPerWeek, Constants.DEFAULT_TIME_OUT);
			JobHrsPerWeek = elementUtil.getElement(UIControlIds.hoursPerWeek).getText();
			log.info("Office location " + JobHrsPerWeek + " found...");
		} catch (NoSuchElementException e) {
			log.error("Office location " + JobHrsPerWeek + " not found...", e.fillInStackTrace());
		}
		return JobHrsPerWeek;
	}
}
