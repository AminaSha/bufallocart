package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
	WebDriver driver;
	public void dragAndDrop(WebDriver driver,WebElement element,int xoffset, int yoffset)
	{
		Actions act = new Actions(driver);
		act.dragAndDropBy(element, xoffset, yoffset).build().perform();

	}

}
