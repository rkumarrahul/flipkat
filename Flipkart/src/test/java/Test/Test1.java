package Test;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericlib.BaseClass;
import com.pom.LoginPage;

@Test
public class Test1 extends BaseClass
{
	@Test
	public void PrintAllPhonesName() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String productName = elib.readDatafromExcel("Sheet1",1,0);
		
		LoginPage log=new LoginPage(driver);
		log.getPopup().click();
		log.getSearchTextfield().sendKeys(productName);
		log.getSearchButton().click();
		//after that to write the data from Excelsheet
		
		int count=0;
		for(int i=1; i<=5; i++)
		{
			List<WebElement> allphones = log.getAllphones();
			log.clickOnNext(i);
			Thread.sleep(2000);
		
			for(int j= 0; j<allphones.size(); j++)
			{
				System.out.println(allphones.get(j).getText());
				elib.setDatafromExcel("Sheet3", j, 0, allphones.get(j).getText());
				count++;
			}
			Thread.sleep(8000);
		
		 
		} 
		System.out.println(count);
	}
}
