import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFromPage {
    private WebDriver driver;
    private final By name=By.id("firstName");
    private final By lastName=By.id("lastName");
    private final By email=By.id("userEmail");


    public PracticeFromPage(WebDriver driver){
        this.driver=driver;
    }


    public void setName(String nameAsString){
        WebElement nameSpace=driver.findElement(name);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);

    }
    public void setLastName(String setLastNameAsString){
        WebElement nameSpace=driver.findElement(lastName);
        nameSpace.click();
        nameSpace.sendKeys(setLastNameAsString);

    }
    public void setEmail(String emailAsString){
        WebElement nameSpace=driver.findElement(email);
        nameSpace.click();
        nameSpace.sendKeys(emailAsString);

    }
    public String getName(){
        //inspect elementi incelediğimde text yok bu yüzden get text methodu ile alamıyorum
        WebElement nameSpace= driver.findElement(name);
        return nameSpace.getAttribute("value");
        //burada kullanacağımız attribute parametre olarak value olacak çünkü text vesaire yok, olmadığında bu şekilde alabiliyorum.
    }
    public String getLastname(){
        WebElement lastnameSpace=driver.findElement(lastName);
        return lastnameSpace.getAttribute("value");
    }
    public String getEmail(){
        WebElement emailSpace=driver.findElement(email);
        return emailSpace.getAttribute("value");
    }
}
