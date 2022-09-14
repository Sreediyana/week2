package Week2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//form[@class='_9vtf']//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
//form[@class='_9vtf']//button

driver.findElement(By.xpath("//div[@id='reg_form_box']//input")).sendKeys("sreediyana111");
driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("govin11d");
driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9876543216");
driver.findElement(By.xpath("//div[@id='password_field']//input")).sendKeys("newpswd");
//ddl
WebElement dd = driver.findElement(By.xpath("//select[@id='month']/preceding-sibling::select"));
//"//div[@id='birthday_wrapper']//span

Select dd1=new Select(dd);
dd1.selectByIndex(1);

WebElement day = driver.findElement(By.xpath("//select[@id='day']/following-sibling::select"));
Select day1=new Select(day);
day1.selectByVisibleText("Oct");

WebElement year = driver.findElement(By.xpath("//select[@id='month']/following-sibling::select"));
Select year1=new Select(year);
year1.selectByValue("1986");
driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();


driver.findElement(By.xpath("//div[@id='reg_form_box']//button[@name='websubmit']")).click();
//driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("deptit");




}

}
