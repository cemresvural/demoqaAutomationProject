import org.junit.jupiter.api.Test;

public class PersonalInformationTest extends  BaseTest{

    //PracticeFromPage practiceFromPage= new PracticeFromPage(driver); null pointer hatası verdi
    //base testte setupdan sonra al,best practice?

    @Test
    public void testSetName(){
        practiceFromPage.setName("Cemre");


    }
    @Test
    public void testSetLastName(){
        practiceFromPage.setLastName("Vural");

    }
    @Test
    public void testSetEmail(){
        practiceFromPage.setEmail("cemresvural@gmail.com");

    }
}
