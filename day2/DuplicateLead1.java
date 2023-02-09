package week6.day2;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DuplicateLead1 extends projectspecification {
	@Test(dataProvider="DuplicateLead")
	public void runDuplicateLead(String ph) throws InterruptedException {
		
	
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
	
}	@DataProvider(name="DuplicateLead")
	public String[][] getData()
	{
		String[][] data = new String[1][1];
		data[0][0]= "98";
		return data;
	}
}
