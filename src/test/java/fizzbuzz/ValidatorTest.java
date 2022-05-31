package fizzbuzz;

import fizzbuzz.Validator;
import fizzbuzz.InvalidInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {
    Validator v=new Validator();
    @Test
    void shuld_throw_exception_when_input_is_dicemal(){
        String message = assertThrows(InvalidInputException.class, () -> {
            // Act
            v.is_int(4.5);
        }).getMessage();
        assertEquals("the number is decimal", message);

    }
    @Test
    void shuld_not_throw_exception_when_input_is_dicemal(){
      boolean actual =v.is_int(4);
        assertTrue(actual);

    }
    @Test
    void shuld_throw_exception_when_input_is_not_one(){
        String message = assertThrows(InvalidInputException.class, () -> {
            // Act
            v.is_int(-1);
        }).getMessage();
        assertEquals("the number is less than one", message);

    }
    @Test
    void shuld_not_throw_exception_when_input_is__is_gritter_than_one(){
        boolean actual =v.is_int(7);
        assertTrue(actual);

    }
}
