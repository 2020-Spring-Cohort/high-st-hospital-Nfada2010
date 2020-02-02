import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmployeeTest {

    @Test
    public void testsGoHere(){

    }
    @Test
    //write code to play with pet to lessen boredom level
    public void shouldBeAbleToHire() {
        Employee underTest = new Employee();}

        @Test
        //write code to play with pet to lessen boredom level
        public void shouldHaveBloodLevel() {
            Employee underTest = new Employee();
            int bloodLevel = underTest.getBloodLevel();
            assertEquals(100, bloodLevel);
        }

    @Test
    public void shouldHaveType() {
        Employee underTest = new Employee();
        assertTrue(underTest instanceof Employee);
        assertTrue(underTest instanceof Nurse);
        assertTrue(underTest instanceof Doctor);
        assertTrue(underTest instanceof Receptionist);
        assertTrue(underTest instanceof Janitor);
        assertTrue(underTest instanceof EmergencyDispatcher);
    }


}


