package Week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//setup browser  driver
		ChromeDriver driver=new ChromeDriver();//launch browser
		driver.get("http://leaftaps.com/opentaps/control/main/");//launch url

		//driver.get("https://google.com/");//launch url
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//find leads
		driver.findElement(By.xpath("//div[@id='left-content-column']//a[text()=\"Find Leads\"]")).click();
		//click 1st resulting lead

		driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='firstName']")).sendKeys("Hari");
		driver.findElement(By.xpath("//table[@id='ext-gen242']//button[contains(text(),'Find Leads')]")).click();
	//	System.out.println(driver.getTitle());
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
driver.findElement(By.xpath("//div[@class='subSectionBlock']//a[@class='linktext']")).click();//not working

System.out.println(driver.getTitle());
		//s	System.out.println(driver.getTitle());
		//div[@class='frameSectionExtra']/a[text()="Edit"]
	driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		//div[@id='ext-gen788']/a
		//enter fname
		//driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("xmlsreediyana1");
		//findleads button
		//driver.findElement(By.xpath("")).click();
		//click 1st resulting lead
		//driver.findElement(By.xpath("")).click();
		//get title
		//System.out.println(driver.getTitle());
		//click edit
		//
		//////driver.findElement(By.xpath("")).click();
		//change company name
			driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@id='updateLeadForm_companyName']")).sendKeys("newcompanyooooo");
		//click update
			driver.findElement(By.xpath("//form[@id='updateLeadForm']//input[@name='submitButton']")).click();

		String updatedname = driver.findElement(By.xpath("//form[@id='viewLead']//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(updatedname);
		
	
	//enter leadid
			//driver.close();
		//driver.findElement(By.name("submitButton")).click();
	}

}
