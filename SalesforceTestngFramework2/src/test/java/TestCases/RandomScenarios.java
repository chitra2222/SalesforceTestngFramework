package TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.PropertiesUtility;

@Listeners(Utility.MyTestNGListeners.class)
public class RandomScenarios extends BaseTestMethods1 {
	@Test(priority = 1, alwaysRun = true)
	public void TestCase34() throws InterruptedException {
		logger.info("Inside Test case34");
		extentReport.logTestinfo("Inside Test case34");
		String expected = "Salesforce - Developer Edition";
		Thread.sleep(4000);
		
		WebElement homeTab = driver.findElement(By.xpath("//li[@id=\"home_Tab\"]/a"));
		clickButton(homeTab,"Home Tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		Thread.sleep(4000);
		
		WebElement userlink = driver.findElement(By.xpath("//h1[@class=\"currentStatusUserName\"]/a[1]"));
		clickButton(userlink, "First and last name link");
		Thread.sleep(4000);
		validateTitle(expected);
		getscreenshot();
		//close();
	}
	@Test(priority = 2, alwaysRun = true)
	public void TestCase35() throws InterruptedException {
		logger.info("Inside Test case35");
		extentReport.logTestinfo("Inside Test case35");
		Thread.sleep(4000);
		
		WebElement homeTab = driver.findElement(By.xpath("//li[@id=\"home_Tab\"]/a"));
		clickButton(homeTab,"Home Tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		Thread.sleep(4000);
		
		WebElement userlink = driver.findElement(By.xpath("//h1[@class=\"currentStatusUserName\"]/a[1]"));
		clickButton(userlink, "First and last name link");
		Thread.sleep(4000);
		
		WebElement editProfile = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]"));
		clickButton(editProfile, "Edit Profile Button");		
		Thread.sleep(4000);
		
		WebElement frame1 = driver.findElement(By.id("contactInfoContentId"));
		driver.switchTo().frame(frame1);
		
		WebElement about = driver.findElement(By.xpath("//li[@id=\"aboutTab\"]/a[1]"));
		clickButton(about,"about tab");		
		WebElement last = driver.findElement(By.id("lastName"));
		enterText(last,"prakashhh", "Last name");
		Thread.sleep(4000);
		WebElement saveall = driver.findElement(By.xpath("//div[@class=\"net-buttons zen-mtl\"]/input[1]"));
		clickButton(saveall,"Save all");		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		WebElement namelink = driver.findElement(By.id("tailBreadcrumbNode"));
		validate(namelink,"prakashhh", "Profile name");
		Thread.sleep(4000);
		WebElement userprofile = driver.findElement(By.id("userNavLabel"));
		validate(userprofile,"prakashhh", "Profile name");
		getscreenshot();
		//close();
	}
	@Test(priority = 3, alwaysRun = true)
	public void TestCase36() throws InterruptedException {
		logger.info("Inside Test case36");
		extentReport.logTestinfo("Inside Test case36");
		PropertiesUtility propertyutility = new PropertiesUtility();
		propertyutility.loadFile("TestDataProperties");
		String url = propertyutility.getPropertyValue("url");
		String uname = propertyutility.getPropertyValue("login.valid.userid");
		String pwd = propertyutility.getPropertyValue("login.valid.password");
		getBrowser(url);
		
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, uname,"User i.d");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, pwd ,"Password");
		WebElement login = driver.findElement(By.id("Login"));
		clickButton(login,"Login");
		Thread.sleep(4000);
		
		WebElement allTabs = driver.findElement(By.xpath("//li[@id=\"AllTab_Tab\"]/a[1]/img[@class=\"allTabsArrow\"]"));
		clickButton(allTabs, "All Tabs");
		Thread.sleep(4000);
		WebElement customize = driver.findElement(By.xpath("//input[@value=\"Customize My Tabs\"]"));
		clickButton(customize, "Customize tabs");
		Thread.sleep(4000);
		WebElement  tab = driver.findElement(By.xpath("//select[@id=\"duel_select_1\"]/option[text()=\"Libraries\"]"));
		clickButton(tab,"Libraries");
		WebElement remove = driver.findElement(By.xpath("//a[@id=\"duel_select_0_left\"]/img[@title=\"Remove\"]"));
		clickButton(remove, "Remove button");
		WebElement save = driver.findElement(By.xpath("//td[@id=\"bottomButtonRow\"]/input[@value=\" Save \"]"));
		clickButton(save, "Save Button");
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//li[@id=\"Workspace_Tab\"]/a[@title=\"Libraries Tab\"]"));
		}catch(org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Test case passed");
		}
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile");
		
		WebElement logout = driver.findElement(By.xpath("//a[@title=\"Logout\"]"));
		clickButton(logout,"Logout");
		Thread.sleep(4000);
		WebElement username1 = driver.findElement(By.id("username"));
		enterText(username1, uname,"User i.d");
		WebElement password1 = driver.findElement(By.id("password"));
		enterText(password1, pwd ,"Password");
		WebElement login1 = driver.findElement(By.id("Login"));
		clickButton(login1,"Login");
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//li[@id=\"Workspace_Tab\"]/a[@title=\"Libraries Tab\"]"));
		}catch(org.openqa.selenium.NoSuchElementException e) {
			logger.info("Test case passed");
		}
		getscreenshot();
		//close();
	}
	@Test(priority = 5, alwaysRun = true)
	public void TestCase37() throws InterruptedException {
		logger.info("Inside Test case37");
		extentReport.logTestinfo("Inside Test case37");
		String expected = "Calendar for";
		Thread.sleep(4000);
		
		WebElement homeTab = driver.findElement(By.xpath("//li[@id=\"home_Tab\"]/a"));
		clickButton(homeTab,"Home Tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		Thread.sleep(4000);
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'Tuesday February 14, 2023')]"));
		clickButton(date, "Date Time Link");
		Thread.sleep(4000);
		WebElement time = driver.findElement(By.xpath("//div[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a[1]"));
		clickButton(time, " Time");
		String baseHandle = driver.getWindowHandle();
		Thread.sleep(4000);
		WebElement subject = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]"));
		clickButton(subject, "Subject");
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!baseHandle.equals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		Thread.sleep(4000);
		WebElement others = driver.findElement(By.xpath("//body/div[2]/ul[1]/li[5]/a[1]"));
		clickButton(others, "Others Button");
		driver.switchTo().window(baseHandle);
		Thread.sleep(4000);
		WebElement endTime = driver.findElement(By.xpath("//input[@id=\"EndDateTime_time\"]"));
		clickButton(endTime,"End Time");
		WebElement picktime = driver.findElement(By.xpath("//div[@id=\"timePickerItem_42\"]"));
		clickButton(picktime, "Pick Time");
		Thread.sleep(4000);
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[@value=\" Save \"]"));
		clickButton(savebtn, "save button");
		Thread.sleep(4000);
		validateTitle(expected);
		//close();
		getscreenshot();
	}
	@Test(priority = 6, alwaysRun = true)
	public void TestCase38() throws InterruptedException {
		logger.info("Inside Test case38");
		extentReport.logTestinfo("Inside Test case38");
		String expected= " Month View ~ Salesforce - Developer Edition";
		Thread.sleep(4000);
		
		WebElement homeTab = driver.findElement(By.xpath("//li[@id=\"home_Tab\"]/a"));
		clickButton(homeTab,"Home Tab");
		WebElement lightning = driver.findElement(By.id("tryLexDialogX"));
		clickButton(lightning,"Lightning alert");
		Thread.sleep(4000);
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'Tuesday February 14, 2023')]"));
		clickButton(date, "Date Time Link");
		Thread.sleep(4000);
		
		WebElement time = driver.findElement(By.xpath("//div[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a[1]"));
		clickButton(time,"Time");
		String baseHandle = driver.getWindowHandle();
		Thread.sleep(4000);
		WebElement subject = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/a[1]/img[1]"));
		clickButton(subject, "Subject");
		Set<String> handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!baseHandle.equals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		Thread.sleep(4000);
		WebElement others = driver.findElement(By.xpath("//body/div[2]/ul[1]/li[5]/a[1]"));
		clickButton(others, "Others Button");
		driver.switchTo().window(baseHandle);
		Thread.sleep(4000);
		WebElement endTime = driver.findElement(By.xpath("//input[@id=\"EndDateTime_time\"]"));
		clickButton(endTime,"End Time");
		WebElement pickTime = driver.findElement(By.xpath("//div[@id=\"timePickerItem_38\"]"));
		clickButton(pickTime, "Pick Time" );
		Thread.sleep(4000);
		
		WebElement recurrence = driver.findElement(By.xpath("//input[@id=\"IsRecurrence\"]"));
		clickButton(recurrence,"recurrence radiobtn");
		WebElement weekly = driver.findElement(By.xpath("//input[@id=\"rectypeftw\"]"));
		clickButton(weekly, "Weekly");
		Thread.sleep(4000);
		WebElement recursiveEnd = driver.findElement(By.xpath("//input[@id=\"RecurrenceEndDateOnly\"]"));
		clickButton(recursiveEnd, "End date");
		WebElement enddate = driver.findElement(By.xpath("//tr[@id=\"calRow5\"]/td[1]"));
		clickButton(enddate,"End");
		Thread.sleep(4000);
		
		WebElement savebtn = driver.findElement(By.xpath("//td[@id=\"topButtonRow\"]/input[@value=\" Save \"]"));
		clickButton(savebtn, "save button");
		Thread.sleep(4000);
	    /* handles = driver.getWindowHandles();
		for(String handle : handles) {
			if(!baseHandle.equals(handle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		try {
		WebElement dismiss = driver.findElement(By.id("dismiss_all"));
		clickButton(dismiss,"Dismiss all");
		}finally {
		driver.switchTo().window(baseHandle);}
		Thread.sleep(4000);*/
	
		WebElement monthview = driver.findElement(By.xpath("//img[@class=\"monthViewIcon\"]"));
		clickButton(monthview, "Month view");
		Thread.sleep(4000);
		validateTitle(expected);
		//close();
		getscreenshot();
		
	}
}
