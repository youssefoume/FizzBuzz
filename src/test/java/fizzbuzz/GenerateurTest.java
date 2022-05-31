package fizzbuzz;

import fizzbuzz.Generateur;
import fizzbuzz.InvalidInputException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GenerateurTest {
    private final Generateur g=new Generateur();


    @Test
    void should_throws_exception_when_k_equal_zero(){
        String message = assertThrows(InvalidInputException.class, () -> {
            // Act
            g.extraire_list(0);
        }).getMessage();
        assertEquals("is equal 0", message);

    }
    @Test
    void should_return_List_when_k_equal_one(){
        List<Integer> actual=g.extraire_list(1);

        assertEquals(List.of(1), actual);

    }
    @Test
    void should_return_List_(){
        List<Integer> actual=g.extraire_list(4);

        assertEquals(List.of(1,2,3,4), actual);

    }
}
