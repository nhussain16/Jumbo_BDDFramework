package parallel;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.pages.JumboJobsPage;
import com.qa.util.Constants;
import com.qa.util.DriverFactory;

import io.cucumber.java.en.*;

public class JumboJobsTestSteps {

	private JumboJobsPage jobsPage = new JumboJobsPage(DriverFactory.getDriver());
	
	@Given("I want to access jumbo jobs portal")
	public void i_want_to_access_jumbo_jobs_portal() {
		// access jumbo jobs portal
		DriverFactory.getDriver().get("https://nl.jobs.jumbo.com/nl/");
		jobsPage.acceptCookies();
	}

	@When("I search for {string}")
	public void i_search_for(String job) {
	    jobsPage.SearchJob(job);
	}

	@Then("searched vacancies count is shown as a result")
	public void searched_vacancies_count_is_shown_as_a_result() {
	    Assert.assertEquals(Constants.TESTER_JOB_COUNT, jobsPage.searchedJobCountIs());
	    
	}
	
	@Then("validation message is shown as a result")
	public void ValidationMessageShown() {
	    Assert.assertEquals(Constants.VALIDATION_MESG , jobsPage.InvalidTextSearchValidationMsg());
	}


	@When("access job details")
	public void access_job_details() {
		 jobsPage.AccessJobDetails();
		 
	}

	@Then("office branch, location and hours per week display on screen")
	public void office_branch_location_and_hours_per_week_display_on_screen() {
		SoftAssert softAssert = new  SoftAssert();
		softAssert.assertEquals(Constants.OFFICE_BRANCH,jobsPage.GetOfficeBranch());
		softAssert.assertEquals(Constants.JOB_LOCATION,jobsPage.GetOfficeLocation());
		softAssert.assertEquals(Constants.JOB_HOURS_PER_WEEK,jobsPage.GetHrsPerWeek());
		softAssert.assertAll();
	}

	@Then("verify the correct page title display")
	public void verify_the_correct_page_title_display() {
		Assert.assertEquals(Constants.JOBS_DETAIL_PAGE_TITLE, jobsPage.getJobsDetailPageTitle());
	}
}
