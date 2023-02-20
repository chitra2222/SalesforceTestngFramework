package TestCases;

import java.util.Set;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.PropertiesUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(Utility.MyTestNGListeners.class)
public class UserMenu extends BaseTestMethods1 {
	
	@Test(priority=1, alwaysRun=true)
	public static void TestCase6() throws InterruptedException {
		logger.info("Inside Test case6");
		extentReport.logTestinfo("Inside Test case6");
		String expProfile = "My Profile";
		String expSwitch ="Switch to Lightning Experience";
		String expLogout ="Logout";
		String expDevConsole="Developer Console";
		String expSettings ="My Settings";
		Thread.sleep(4000);
		
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile drop down");	
		Thread.sleep(4000);
				
		WebElement myProfile = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[1]"));
		WebElement mySettings = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[2]"));
		WebElement devConsole = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[3]"));
		WebElement switchLight = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[4]"));
		WebElement logout = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[5]"));
		
		
		if(myProfile.getText().equalsIgnoreCase(expProfile) && mySettings.getText().equalsIgnoreCase(expSettings)
		  && devConsole.getText().equalsIgnoreCase(expDevConsole) && switchLight.getText().equalsIgnoreCase(expSwitch)
		  && logout.getText().equalsIgnoreCase(expLogout)) {
			logger.info("TestCase Passed");
		}
		else {
			logger.error("Test Case failed");
		}
		getscreenshot();
		//close();	
	}
	@Test(priority=2, alwaysRun=true)
	public void TestCase7() throws InterruptedException {
		logger.info("Inside Test case7");
		extentReport.logTestinfo("Inside Test case7");
		String expTitle = "User: Chitralekha prakash ~ Salesforce - Developer Edition";	
		Thread.sleep(6000);
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile drop down");	
		Thread.sleep(4000);
		
		WebElement myProfile = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[1]"));
		clickButton(myProfile,"My Profile link");		
		Thread.sleep(4000);
		
		WebElement editProfile = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[2]/div[2]/div[1]/h3[1]/div[1]/div[1]/a[1]/img[1]"));
		clickButton(editProfile,"Edit Profile");
		Thread.sleep(4000);
		
		WebElement frame1 = driver.findElement(By.id("contactInfoContentId"));
		driver.switchTo().frame(frame1);	
		WebElement about = driver.findElement(By.xpath("//li[@id=\"aboutTab\"]/a[1]"));
		clickButton(about, "about tab");	
		WebElement last = driver.findElement(By.id("lastName"));
		enterText(last,"Prakash","Last name");
		Thread.sleep(4000);	
		WebElement save = driver.findElement(By.xpath("//div[@class=\"net-buttons zen-mtl\"]/input[1]"));
		clickButton(save, "Save Button");		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);

		WebElement post = driver.findElement(By.xpath("//span[@class=\"publisherattachtext \" and text()=\"Post\"]"));
		clickButton(post, "Post Tab");		
		Thread.sleep(4000);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[contains(@title,\"Rich Text Editor, publisherRichTextEditor\")]"));
		driver.switchTo().frame(frame2);
		Thread.sleep(4000);	
		WebElement postText = driver.findElement(By.xpath("/html[1]/body[text()=\"Share an update, @mention someone...\"]"));
		clickButton(postText,"Post Text");
		enterText(postText, "My 1st automation....", "Post Text");
		driver.switchTo().defaultContent();	
		Thread.sleep(4000);
		String curDir = System.getProperty("user.dir");

		
		WebElement postLink =driver.findElement(By.xpath("//input[@id=\"publishersharebutton\"]"));
		clickButton(postLink, "Post Link Tab");		
		Thread.sleep(4000);
		System.out.println("Message is posted");
		WebElement file = driver.findElement(By.xpath("//a[@id=\"publisherAttachContentPost\"]/span[1]"));
		clickButton(file, "File Tab");		
		Thread.sleep(4000);
		WebElement choose = driver.findElement(By.id("chatterUploadFileAction"));
		clickButton(choose, "Choose Tab");		
		Thread.sleep(4000);
		WebElement chooseFile = driver.findElement(By.id("chatterFile"));
		enterText(chooseFile, "C:\\Users\\chitr\\eclipse-workspace\\SalesforceTestngFramework\\src\\test\\resources\\Upload (2).txt", "Choose file");		
		Thread.sleep(4000);
		WebElement saveFile = driver.findElement(By.id("publishersharebutton"));
		clickButton(saveFile, "save File");		
		Thread.sleep(4000);
		WebElement moderator = driver.findElement(By.xpath("//span[@id=\"displayBadge\"]"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(moderator).build().perform();
		WebElement addPhoto = driver.findElement(By.xpath("//div[@class=\"photoUploadSection\"]/a[@id=\"uploadLink\"]"));
		clickButton(addPhoto, "Add Photo");		
		Thread.sleep(4000);
		
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id=\"uploadPhotoContentId\"]"));
		driver.switchTo().frame(frame3);
		WebElement choosePhoto = driver.findElement(By.xpath("//input[@id=\"j_id0:uploadFileForm:uploadInputFile\"]"));
		choosePhoto.sendKeys("C:\\Users\\chitr\\eclipse-workspace\\SalesforceTestngFramework\\src\\test\\resources\\20210329_095508.jpg");
		Thread.sleep(4000);
		
		WebElement savePhoto = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
		clickButton(savePhoto,"Save Photo");
		savePhoto.click();
         Thread.sleep(4000);  
         WebElement savePic = driver.findElement(By.id("j_id0:j_id7:save"));
         clickButton(savePic, "Save Pic");       	 
       	 Thread.sleep(4000);
         driver.switchTo().defaultContent();
		//close();	
 		getscreenshot();

	}
	@Test(priority=3, alwaysRun=true)
	public void TestCase8() throws InterruptedException {
		logger.info("Inside Test case8");
		extentReport.logTestinfo("Inside Test case8");
		Thread.sleep(5000);
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile drop down");	
		Thread.sleep(4000);
		
		WebElement mySetting = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[2]"));
		clickButton(mySetting, "My Setting");		
		WebElement personal = driver.findElement(By.id("PersonalInfo_font"));
		clickButton(personal,"Personal");		
		WebElement loginHistory = driver.findElement(By.id("LoginHistory_font"));
		clickButton(loginHistory, "login History");		
		WebElement loginDownload = driver.findElement(By.xpath("//div[@id=\"RelatedUserLoginHistoryList_body\"]//a[1]"));
		clickButton(loginDownload, "login Download");		
		WebElement display = driver.findElement(By.xpath("//span[@id=\"DisplayAndLayout_font\"]"));
		clickButton(display,"Display");		
		Thread.sleep(4000);
		
		WebElement customizeTabs = driver.findElement(By.xpath("//span[@id=\"CustomizeTabs_font\"]"));
		clickButton(customizeTabs,"customize Tabs");		
		WebElement customApp = driver.findElement(By.xpath("//select[@id=\"p4\"]"));
		Select ob = new Select(customApp);
		ob.selectByVisibleText("Salesforce Chatter");
		
		Thread.sleep(4000);
		WebElement availableTab = driver.findElement(By.xpath("//select[@id=\"duel_select_0\"]"));
		selectDropDown(availableTab, "Reports");
		Thread.sleep(4000);
		WebElement addbtn = driver.findElement(By.xpath("//img[@class=\"rightArrowIcon\"]"));
		clickButton(addbtn, "Add Button");	
		Thread.sleep(4000);
		
		WebElement email = driver.findElement(By.xpath("//span[@id=\"EmailSetup_font\"]"));
		clickButton(email, "Email button");
		WebElement myemail = driver.findElement(By.xpath("//a[@id=\"EmailSettings_font\"]"));
		clickButton(myemail, "My email");		
		Thread.sleep(4000);
		WebElement name = driver.findElement(By.xpath("//input[@id=\"sender_name\"]"));
		enterText(name, "Chitra", "Name Field");
		
		WebElement address = driver.findElement(By.xpath("//input[@id=\"sender_email\"]"));
		enterText(address, "chitralekhajayaprakash@gmail.com", "Address field");
		WebElement bcc = driver.findElement(By.xpath("//input[@id=\"auto_bcc1\"]"));
		clickButton(bcc, "bcc field");		
		Thread.sleep(4000);
		
		WebElement save = driver.findElement(By.xpath("//td[@id=\"bottomButtonRow\"]/input[@class=\"btn primary\"]"));
		clickButton(save, "Save button");
		Thread.sleep(4000);
		WebElement calendar = driver.findElement(By.xpath("//span[@id=\"CalendarAndReminders_font\"]"));
		clickButton(calendar, "Calendar");		
		WebElement activity = driver.findElement(By.xpath("//span[@id=\"Reminders_font\"]"));
		clickButton(activity,"Activity button");		
		Thread.sleep(4000);
		
		WebElement testRemain = driver.findElement(By.xpath("//input[@id=\"testbtn\"]"));
		clickButton(testRemain, "Test Remain");		
		Thread.sleep(4000);
		//close();	
		getscreenshot();

	}
	
	@Test(priority = 4, alwaysRun = true)
	public void TestCase9() throws InterruptedException {
		logger.info("Inside Test case9");
		extentReport.logTestinfo("Inside Test case9");
		String expected = "Developer Console";	
		Thread.sleep(4000);
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile drop down");	
		Thread.sleep(4000);
		
		String baseHandle = driver.getWindowHandle();
		
		WebElement devConsole = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[3]"));
		clickButton(devConsole,"Developer console");
		
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			if(!baseHandle.equals(handle)) { 
				driver.switchTo().window(handle);
				break;
			}
		}
		Thread.sleep(4000);
		driver.quit();	
		getscreenshot();

	}
	@Test(priority=5, alwaysRun=true)
	public void TestCase10() throws InterruptedException {
		logger.info("Inside Test case10");
		extentReport.logTestinfo("Inside Test case10");
		String expected = "Login | Salesforce";
		Thread.sleep(4000);
		WebElement profile = driver.findElement(By.id("userNavLabel"));
		clickButton(profile,"Profile drop down");	
		Thread.sleep(4000);
		
		WebElement logout = driver.findElement(By.xpath("//div[@id=\"userNav-menuItems\"]/a[5]"));
		clickButton(logout,"Log out");		
		Thread.sleep(4000);
		validateTitle(expected);
		//close();
		getscreenshot();

	}		
}
