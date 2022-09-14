package Week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//click phone
		driver.findElement(By.xpath("//div[@id='findLeads']//span[text()='Phone']")).click();
		//enter phone number
		//driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='phoneCountryCode']")).sendKeys("1");
	//	driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='phoneAreaCode']")).sendKeys("47");
		driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='phoneNumber']")).sendKeys("1111");
		
		//findleads button
		driver.findElement(By.xpath("//table[@id='ext-gen242']//button[contains(text(),'Find Leads')]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).getText());
		String dellinktext = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).getText();
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();//not working


		//delete button
	driver.findElement(By.xpath("//a[text()=\"Edit\"]/following-sibling::a")).click();
	//find lead
	//find leads
			driver.findElement(By.xpath("//div[@id='left-content-column']//a[text()=\"Find Leads\"]")).click();
	//div[@id='ext-gen788']/a
		//enter lead id
			driver.findElement(By.xpath("//div[@id='findLeads']//input[@name='id']")).sendKeys(dellinktext);
			//find lead button
			driver.findElement(By.xpath("//table[@id='ext-gen242']//button[contains(text(),'Find Leads')]")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String norecordstext = driver.findElement(By.xpath("//div[@id='findLeads']//div[@class='x-paging-info']")).getText();
		System.out.println(norecordstext);
		driver.close();
		
	
	

	}

}
