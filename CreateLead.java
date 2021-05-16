package week5.day1.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass 
{
	@Test
	public void createLead() 
	{
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Expleo");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mari");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vignesh");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mtm.vignesh@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("3420079");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

	}

}