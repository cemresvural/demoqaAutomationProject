import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGenderSelection extends BaseTest{


    @Test
    public void checkMaleRadioButton(){
        practiceFromPage.genderSection().clickRadioButton(GenderSection.Genders.MALE);
        Assertions.assertTrue(practiceFromPage.genderSection().isRadioButtonChecked(GenderSection.Genders.MALE),
                "Male radio button is not checked!");

    }
    @Test
    public void checkFemaleRadioButton(){
        practiceFromPage.genderSection().clickRadioButton(GenderSection.Genders.FEMALE);
        Assertions.assertTrue(practiceFromPage.genderSection().isRadioButtonChecked(GenderSection.Genders.FEMALE),
                "Female radio button is not checked!");

    }
    @Test
    public void checkOtherRadioButton(){
        practiceFromPage.genderSection().clickRadioButton(GenderSection.Genders.OTHER);
        Assertions.assertTrue(practiceFromPage.genderSection().isRadioButtonChecked(GenderSection.Genders.OTHER),
                "Other radio button is not checked!");

    }

}
