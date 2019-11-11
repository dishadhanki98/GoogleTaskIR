package GoogleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends Utils{
    LoadProps loadProps=new LoadProps();

    private By _searchBar= By.name("q");
    private By _clickBar=By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");

    //div[@class='FPdoLc VlcLAe']//input[@name='btnK']



    public void enterSearchBar()
    {
        enterText(_searchBar,loadProps.getProperty("textsearchbar"));
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }
    public void clickSearchBar()
    {

        clickElement(_clickBar);
    }


}
