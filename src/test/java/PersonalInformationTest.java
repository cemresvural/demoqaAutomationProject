import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonalInformationTest extends  BaseTest{

    //PracticeFromPage practiceFromPage= new PracticeFromPage(driver); null pointer hatası verdi
    //base testte setupdan sonra al,best practice?

    @Test
    public void testSetName(){
        PracticeFromPage practiceFromPage=new PracticeFromPage(driver);
        practiceFromPage.setName("Cemre");
        Assertions.assertEquals("Cemre",practiceFromPage.getName(),"Name value is not correct!");


    }
    @Test
    public void testSetLastName(){
        PracticeFromPage practiceFromPage=new PracticeFromPage(driver);
        practiceFromPage.setLastName("Vural");
        Assertions.assertEquals("Vural",practiceFromPage.getLastname(),"Last name value is not correct!");

    }
    @Test
    public void testSetEmail(){
        PracticeFromPage practiceFromPage=new PracticeFromPage(driver);
        practiceFromPage.setEmail("cemresvural@gmail.com");
        Assertions.assertEquals("cemresvural@gmail.com",practiceFromPage.getEmail(),"Email name value is not correct!");

    }
}
