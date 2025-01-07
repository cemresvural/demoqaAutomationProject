import org.junit.jupiter.api.Test;

public class TestGenderSelection extends BaseTest{


    @Test
    public void checkMaleRadioButton(){
        practiceFromPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);

    }
    @Test
    public void checkFemaleRadioButton(){
        practiceFromPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);

    }
    @Test
    public void checkOtherRadioButton(){
        practiceFromPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);

    }

}
