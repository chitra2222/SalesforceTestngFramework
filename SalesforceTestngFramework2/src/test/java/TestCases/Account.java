package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Utility.MyTestNGListeners.class)
public class Account extends BaseTestMethods1 {
	@Test(priority=1, alwaysRun = true)
	public void TestCase11() throws InterruptedException {
		logger.info("Inside Test case11");
		//extentReport.logTestinfo("Inside Test case11");
		Thread.sleep(4000);
		WebElement accounts = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		clickButton(accounts, "Accounts Tab");			
		WebElement closeLight = driver.findElement(By.id("tryLexDialogX"));
		clickButton(closeLight, "Lightning alert");		
		Thread.sleep(4000);
		WebElement newAccount = driver.findElement(By.xpath("//input[@value=\" New \"]"));
		clickButton(newAccount, "New Account");
		Thread.sleep(4000);
		
		WebElement accname = driver.findElement(By.id("acc2"));
		enterText(accname, "DhanamJPrakash", "Account name" );
		WebElement accType = driver.findElement(By.id("acc6"));
		selectDropDown(accType, "Technology Partner");
		WebElement accPriority = driver.findElement(By.id("00NDn00000Sja1A"));
		selectDropDown(accPriority, "High");
		Thread.sleep(4000);
		
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"bottomButtonRow\"]/input[@value=\" Save \"]"));
		clickButton(savebtn, "Save Button");
		Thread.sleep(4000);
		//assertvalue("Salesforce - Developer Edition");
		validateTitle("Salesforce - Developer Edition");
		getscreenshot();
		//close();	
	}
	@Test(priority=2, alwaysRun = true)
	public void TestCase12() throws InterruptedException {
		logger.info("Inside Test case12");
		extentReport.logTestinfo("Inside Test case12");
		Thread.sleep(4000);
		WebElement accounts = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		clickButton(accounts, "Accounts Tab");			
		WebElement closeLight = driver.findElement(By.id("tryLexDialogX"));
		clickButton(closeLight, "Lightning alert");		
		Thread.sleep(4000);
		
		WebElement newView = driver.findElement(By.xpath("//a[text()=\"Create New View\"]"));
		clickButton(newView, "New View");		
		WebElement viewName = driver.findElement(By.id("fname"));
		enterText(viewName, "Tekenexnewdh", "View Name");		
		WebElement viewUnique = driver.findElement(By.id("devname"));
		enterText(viewUnique, "Tekenexdh_view", "Unique view" );		
		WebElement savebtn = driver.findElement(By.xpath("//div[@class=\"pbHeader\"]//input[1][@class=\"btn primary\"]"));
		clickButton(savebtn,"Save button");	
		Thread.sleep(5000);
		Assert.assertTrue(true);
		getscreenshot();
		//close();
	}
	@Test(priority=3, alwaysRun = true)
	public void TestCase13() throws InterruptedException {
		logger.info("Inside Test case13");
		extentReport.logTestinfo("Inside Test case13");
		Thread.sleep(4000);
		WebElement accounts = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		clickButton(accounts, "Accounts Tab");			
		WebElement closeLight = driver.findElement(By.id("tryLexDialogX"));
		clickButton(closeLight, "Lightning alert");		
		Thread.sleep(4000);
		WebElement viewList = driver.findElement(By.xpath("//select[@id=\"fcf\" and @name=\"fcf\"]"));		
		selectDropDown(viewList, "Tekarchdatanew");
		Thread.sleep(5000);
		
		WebElement edit = driver.findElement(By.xpath("//form[@id=\"filter_element\"]//a[text()=\"Edit\"]"));
		clickButton(edit, "Edit Button");		
		Thread.sleep(4000);
		WebElement editname = driver.findElement(By.xpath("//input[@id=\"fname\"]"));
		enterText(editname, "Tekarchdatanew", "Edit Name");
		
		WebElement field = driver.findElement(By.xpath("//select[@id=\"fcol1\"]"));
		selectDropDown(field,"Account Name" );
		Thread.sleep(4000);
		WebElement operator = driver.findElement(By.xpath("//select[@id=\"fop1\"]"));
		selectDropDown(operator, "contains" );
		
		WebElement value = driver.findElement(By.xpath("//input[@name=\"fval1\"]"));
		enterText(value, "a", "value");
		WebElement save = driver.findElement(By.xpath("//input[@class=\"btn primary\" and @data-uidsfdc=\"5\"]"));
		clickButton(save, "Save Button");		
		Thread.sleep(4000);
		Assert.assertTrue(true);
		getscreenshot();
		//close();
	}
	@Test(priority=4, alwaysRun = true)
	public void TestCase14() throws InterruptedException {	
		logger.info("Inside Test case14");
		extentReport.logTestinfo("Inside Test case14");
		Thread.sleep(4000);
		WebElement accounts = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		clickButton(accounts, "Accounts Tab");			
		WebElement closeLight = driver.findElement(By.id("tryLexDialogX"));
		clickButton(closeLight, "Lightning alert");		
		Thread.sleep(4000);
		
		WebElement mergeLink = driver.findElement(By.xpath("//div[@class=\"lbBody\"]//a[1][text()=\"Merge Accounts\"]"));
		clickButton(mergeLink, "Merge Link");		
		Thread.sleep(4000);
		
		WebElement accText = driver.findElement(By.id("srch"));
		enterText(accText, "Dh", "Account Text");		
		WebElement findaccts = driver.findElement(By.xpath("//input[@name=\"srchbutton\" and @value=\"Find Accounts\"]"));
		clickButton(findaccts, "Find accounts");		
		Thread.sleep(4000);
		
		WebElement clickbtn = driver.findElement(By.xpath("//input[@id=\"cid0\"]"));
		clickButton(clickbtn, "Click Button");		
		WebElement clickbtn1 = driver.findElement(By.xpath("//input[@id=\"cid1\"]"));
		clickButton(clickbtn1, "Click Button");
		Thread.sleep(4000);
		
		WebElement next = driver.findElement(By.xpath("//div[@class=\"pbWizardHeader\"]//input[@value=\" Next \"]"));
		clickButton(next, "Next Button");		
		Thread.sleep(4000);
		WebElement merge = driver.findElement(By.xpath("//div[@class=\"pbWizardHeader\"]//input[@value=\" Merge \" and @title=\"Merge\"]"));
		clickButton(merge, "Merge Button");
	
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		Thread.sleep(4000);
		Assert.assertTrue(true);
		getscreenshot();
		//close();
	}
	@Test(priority=5, alwaysRun = true)
	public void TestCase15() throws InterruptedException {
		logger.info("Inside Test case15");
		extentReport.logTestinfo("Inside Test case15");
		Thread.sleep(4000);
		WebElement accounts = driver.findElement(By.xpath("//a[@title=\"Accounts Tab\"]"));
		clickButton(accounts, "Accounts Tab");			
		WebElement closeLight = driver.findElement(By.id("tryLexDialogX"));
		clickButton(closeLight, "Lightning alert");		
		Thread.sleep(4000);

		WebElement reportLink = driver.findElement(By.xpath("//a[text()=\"Accounts with last activity > 30 days\"]"));
		clickButton(reportLink, "Report Link");		
		Thread.sleep(4000);
		
		WebElement from = driver.findElement(By.xpath("//img[@id = \"ext-gen152\"]"));
		clickButton(from, "From");		
		Thread.sleep(4000);
		WebElement today=driver.findElement(By.xpath("//td[@title=\"Today\"]"));
		clickButton(today, "today");		
		Thread.sleep(4000);

		WebElement toDate = driver.findElement(By.xpath("//input[@id=\"ext-comp-1045\"]"));
		toDate.clear();
		
		WebElement to = driver.findElement(By.xpath("//img[@id=\"ext-gen154\"]"));
		clickButton(to, "to");		
		Thread.sleep(6000);
		
		WebElement today1 = driver.findElement(By.xpath("//button[@id=\"ext-gen292\"]"));
		clickButton(today1, "Today");		
		WebElement savebtn = driver.findElement(By.xpath("//button[@id=\"ext-gen49\"]"));
		clickButton(savebtn, "Save Button");
		Thread.sleep(4000);
		
		WebElement reportName = driver.findElement(By.xpath("//input[@id=\"saveReportDlg_reportNameField\"]"));
		enterText(reportName, "Finreport", "Report Name");		
		WebElement reportUnique = driver.findElement(By.xpath("//input[@id=\"saveReportDlg_DeveloperName\"]"));
		enterText(reportUnique, "Finalreports", "Report unique name" );
		Thread.sleep(5000);
		
		WebElement saverun = driver.findElement(By.xpath("//button[@id=\"ext-gen312\"]"));
		clickButton(saverun, "Save and Run");		
		Thread.sleep(4000);
		WebElement image=driver.findElement(By.xpath("//div[@class=\"content\"]/h1"));
		//assertvalue("Finreport");
		validate(image,"Finreport", "Image");
		getscreenshot();
		//close();
		
	}




}
