package src;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		 System.out.print(false);
		 
		 // Adding sevijay comment
		
		 // adding vijayt comment
		 
		 System.out.print(true);
		 

			FirefoxDriver driver = new FirefoxDriver();

			driver.get("http://erail.in");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.findElementById("txtStationFrom").sendKeys(Keys.CLEAR, "MAS", Keys.TAB);

			driver.findElementById("txtStationTo").sendKeys(Keys.CLEAR, "BZA", Keys.TAB);

			Thread.sleep(5000);

			WebElement table = driver
					.findElementByXPath("//*[@class='DataTable TrainList']");

			for (int i = 1; i <= table.findElements(By.tagName("tr")).size(); i++) {

				for (int j = 1; j <= table.findElements(By.tagName("tr")).get(i-1).findElements(By.tagName("td")).size(); j++) {

					System.out.println(table.findElement(
							By.xpath("//tbody/tr[" + i + "]/td[" + j + "]"))
							.getText());

				}
			}

			driver.quit();

	}

}
