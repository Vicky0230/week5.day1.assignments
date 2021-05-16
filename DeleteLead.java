package week5.day1.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;

public class DeleteLead extends BaseClass
{
	@Ignore
	public void deleteLead() throws InterruptedException 
	{

		driver.findElement(By.linkText("Find Leads")).click();
		//Thread.sleep(3000);

		driver.findElement(By.linkText("Phone")).click();

		driver.findElement(By.name("phoneNumber")).sendKeys("234");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);

		String LeadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Delete")).click();
		//Thread.sleep(3000);

		driver.findElement(By.linkText("Find Leads")).click();
		//Thread.sleep(3000);

		driver.findElement(By.name("id")).sendKeys(LeadId);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		String Text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(Text);

		if(Text.contains("No records to display")) 
		{
			System.out.println("Lead is deleted");
		}
		else
		{
			System.out.println("Lead is not deleted");
		}


	} 

}