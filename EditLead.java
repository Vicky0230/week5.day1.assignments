package week5.day1.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditLead extends BaseClass{

	@Test
	public void editLead() throws InterruptedException 
	{
		
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mari");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(3000);
	
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();

		String Title = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		System.out.println(Title);

		String OldName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String Old = OldName.replaceAll("[^a-zA-Z]", " ");
		System.out.println("Old name is -" + Old);

		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();

		driver.findElement(By.id("updateLeadForm_companyName")).clear();

		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ZOHO");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		String UpdateName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String CompanyName = UpdateName.replaceAll("[^a-zA-Z]", " ");
		System.out.println("Company Name  Updated to -" + CompanyName);

		if (Old.equals(CompanyName)) 
		{
			System.out.println("updated the company & names are same ");
		} 
		else 
		{
			System.out.println("Lead is Updated");
		}
		
		
	}

}