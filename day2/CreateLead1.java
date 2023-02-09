package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead1 extends projectspecification {
	@Test(dataProvider = "CreateLead")
	public void runCreateLead(String companyName, String firstname, String lastname) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="CreateLead")
	public String[][] getData()
	{
		String[][] data = new String[2][3];
		data[0][0]="Kowsi";
		data[0][1]="Divya";
		data[0][2]="Hi";
		data[1][0]="Latha";
		data[1][1]="Selvakumar";
		data[1][2]="Hlo";
		
		return data;
	}
}

