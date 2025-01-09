import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFromPage extends BasePage{

    private final By nameLocater =By.id("firstName");
    private final By lastNameLocater =By.id("lastName");
    private final By emailLocater =By.id("userEmail");

    private GenderSection genderSection;

    public PracticeFromPage(WebDriver driver){
        super(driver);
        genderSection=new GenderSection(driver);
    }
    public GenderSection genderSection(){
        return this.genderSection;
    }

    public void setName(String name){
      type(nameLocater,name);

    }
    public void setLastName(String lastName){
        type(lastNameLocater,lastName);

    }
    public void setEmail(String email){
      type(emailLocater,email);
    }
    public String getName(){
        return find(nameLocater).getAttribute("value");
    }
    public String getLastname(){
        return find(lastNameLocater).getAttribute("value");
    }
    public String getEmail(){
        return find(emailLocater).getAttribute("value");
    }
}
