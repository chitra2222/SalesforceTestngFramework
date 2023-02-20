package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.PropertiesUtility;

@Listeners(Utility.MyTestNGListeners.class)
public class Oppurtunity extends BaseTestMethods1 {
	@Test(priority = 1, alwaysRun = true)
	public void TestCase16() throws InterruptedException {
		logger.info("Inside Test case16");
		extentReport.logTestinfo("Inside Test case16");
		String expallopt = "All Opportunities";
		String expclosingnextmonth = "Closing Next Month";
		String expclosingthismonth = "Closing This Month";
		String expmyopt = "My Opportunities";
		String expnewlastweek = "New Last Week";
		String expnewthisweek = "New This Week";
		String expoptpipeline = "Opportunity Pipeline";
		String expprivat = "Private";
		String exprecentview = "Recently Viewed Opportunities";
		String expwon = "Won"; 
		Thread.sleep(4000);
		
		WebElement oppurtunity = driver.findElement(By.xpath("//li[@id=\"Opportunity_Tab\"]/a[1]"));
		clickButton(oppurtunity,"Oppurtunity tab");
		WebElement lightningalert = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		clickButton(lightningalert,"lightningalert close button");
		Thread.sleep(4000);
		WebElement optDrop = driver.findElement(By.id("fcf"));
		clickButton(optDrop,"opt Dropdown");
		Thread.sleep(4000);
		WebElement allopt = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[1]"));
		WebElement closingnextmonth = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[2]"));
		WebElement closingthismonth = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[3]"));
		WebElement myopt = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[4]"));
		WebElement newlastweek = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[5]"));
		WebElement newthisweek = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[6]"));
		WebElement optpipeline = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[7]"));
		WebElement privat = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[8]"));
		WebElement recentview = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[9]"));
		WebElement won = driver.findElement(By.xpath("//select[@id=\"fcf\"]/option[10]"));
		
		if(allopt.getText().equalsIgnoreCase(expallopt) && closingnextmonth.getText().equals(expclosingnextmonth) && closingthismonth.getText().equals(expclosingthismonth) 
				&& myopt.getText().equals(expmyopt) && newlastweek.getText().equals(expnewlastweek) && newthisweek.getText().equals(expnewthisweek)
				&& optpipeline.getText().equals(expoptpipeline) && privat.getText().equals(expprivat) && recentview.getText().equals(exprecentview)
				&& won.getText().equals(expwon)) {
			logger.info("Test case passed");
		}else {
			logger.error("Test case failed");
		}
		//close();
		getscreenshot();
	}
	@Test(priority = 2, alwaysRun = true)
	public void TestCase17() throws InterruptedException {
		logger.info("Inside Test case17");
		extentReport.logTestinfo("Inside Test case17");
		String expected = "Salesforce - Developer Edition";
		Thread.sleep(5000);
		
		WebElement oppurtunity = driver.findElement(By.xpath("//li[@id=\"Opportunity_Tab\"]/a[1]"));
		clickButton(oppurtunity,"Oppurtunity tab");
		WebElement lightningalert = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		clickButton(lightningalert,"lightningalert close button");
		Thread.sleep(4000);
		
		WebElement createnew = driver.findElement(By.id("createNewButton"));
	    clickButton(createnew,"create new dropdown");		
		WebElement createnewopt = driver.findElement(By.xpath("//div[@id=\"createNewMenu\"]/a[4]"));
	    clickButton(createnewopt,"create new oppurtunity");
		Thread.sleep(4000);
		WebElement optname = driver.findElement(By.id("opp3"));
		enterText(optname, "lekhaoppurtunity" ,"oppurtunity name");
		String baseHandle= driver.getWindowHandle();
		WebElement acctname = driver.findElement(By.id("opp4"));
		acctname.clear();
		WebElement searchacctname = driver.findElement(By.xpath("//a[@id=\"opp4_lkwgt\"]/img[@class=\"lookupIcon\"]"));
		clickButton(searchacctname,"Search Account");
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!baseHandle.equals(handle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(4000);
		WebElement frame1 = driver.findElement(By.xpath("//frame[@id=\"resultsFrame\"]"));
		driver.switchTo().frame(frame1);
		Thread.sleep(4000);		
		WebElement accname = driver.findElement(By.xpath("//tr[@class=\"dataRow even first\"]//a[@class=\" dataCell \"]"));
		clickButton(accname,"Account name");
		
		driver.switchTo().window(baseHandle);
		Thread.sleep(4000);
		WebElement closedate = driver.findElement(By.xpath("//span[@class=\"dateFormat\"]/a[1]"));
		clickButton(closedate,"Close Date");
		WebElement stage = driver.findElement(By.xpath("//select[@id=\"opp11\"]"));
		selectDropDown(stage,"Qualification");
		WebElement probability = driver.findElement(By.id("opp12"));
		enterText(probability, "20", "Probability");
		Thread.sleep(4000);
		WebElement leadsource = driver.findElement(By.id("opp6"));
		selectDropDown(leadsource, "Phone Inquiry");
		
		WebElement save = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[1]"));
		clickButton(save,"Save Button");
		
		Thread.sleep(4000);
		//System.out.println(driver.getTitle());
		
		validateTitle(expected);
		//close();
		getscreenshot();

	}
	@Test(priority = 3, alwaysRun = true)
	public void TestCase18() throws InterruptedException {
		logger.info("Inside Test case18");
		extentReport.logTestinfo("Inside Test case18");
		String expected = "Opportunity Pipeline ~ Salesforce - Developer Edition";
		Thread.sleep(5000);
		
		WebElement oppurtunity = driver.findElement(By.xpath("//li[@id=\"Opportunity_Tab\"]/a[1]"));
		clickButton(oppurtunity,"Oppurtunity tab");
		WebElement lightningalert = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		clickButton(lightningalert,"lightningalert close button");
		Thread.sleep(4000);
		
		WebElement opptPipeline = driver.findElement(By.xpath("//div[@class=\"lbBody\"]//a[text()='Opportunity Pipeline']"));
		clickButton(opptPipeline, "Oppurtunity pipeLine");
		Thread.sleep(4000);
		validateTitle(expected);
		//close();
		getscreenshot();

	}
	@Test(priority = 4, alwaysRun = true)
	public void TestCase19() throws InterruptedException {
		logger.info("Inside Test case19");
		extentReport.logTestinfo("Inside Test case19");
		String expected = "Stuck Opportunities ~ Salesforce - Developer Edition";
		Thread.sleep(5000);
		
		WebElement oppurtunity = driver.findElement(By.xpath("//li[@id=\"Opportunity_Tab\"]/a[1]"));
		clickButton(oppurtunity,"Oppurtunity tab");
		WebElement lightningalert = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		clickButton(lightningalert,"lightningalert close button");
		Thread.sleep(4000);
		WebElement stuckopurtunity = driver.findElement(By.xpath("//div[@class=\"lbBody\"]//a[text()=\"Stuck Opportunities\"]"));
		clickButton(stuckopurtunity,"Stuck oppurtunities link");
		Thread.sleep(4000);
		validateTitle(expected);
		//close();

	}
	@Test(priority = 5, alwaysRun = true)
	public void TestCase20() throws InterruptedException {
		logger.info("Inside Test case20");
		extentReport.logTestinfo("Inside Test case20");
		String expected = "Opportunity Report ~ Salesforce - Developer Edition";
		Thread.sleep(5000);
		
		WebElement oppurtunity = driver.findElement(By.xpath("//li[@id=\"Opportunity_Tab\"]/a[1]"));
		clickButton(oppurtunity,"Oppurtunity tab");
		
		WebElement lightningalert = driver.findElement(By.xpath("//a[@id=\"tryLexDialogX\"]"));
		clickButton(lightningalert,"lightningalert close button");
		Thread.sleep(4000);
		
		WebElement interval = driver.findElement(By.id("quarter_q"));
		selectDropDown(interval, "Next FQ");
		WebElement include = driver.findElement(By.id("open"));
		selectDropDown(include,"All Opportunities");
		Thread.sleep(4000);
		WebElement runReport = driver.findElement(By.xpath("//input[@value=\"Run Report\" and @name=\"go\"]"));
		clickButton(runReport, "Run Report Button");
		Thread.sleep(4000);
		validateTitle(expected);
		//close();
		getscreenshot();


	}






}
