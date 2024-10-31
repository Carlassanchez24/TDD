import org.example.ListDivisible;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListDivisibleTest {
    @Test
    @DisplayName("If the list has numbers divisible by de divisor, return those numbers to another array")
    public void test_WhenListHasDivisibleNumbers_thenReturnThoseNumbers() {
        //Given
        List<Integer> list = List.of(3,4,5,6,7,8,9,10,20);
        int divisor = 5;
        //When
        List<Integer> result = ListDivisible.divisibleList(list, divisor);
        //Then
        assertEquals(List.of(5,10,20), result, "Expected numbers divisible bu divisor");
    }
}
