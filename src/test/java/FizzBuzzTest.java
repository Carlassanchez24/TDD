import org.example.Fizzbuzz;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {

    @Test
    @DisplayName("If the number is divisible by 3, return Fizz")
    public void test_whenTheNumberIsDivisibleByThree_thenReturnFizz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // When
        String result = fizzbuzz.checkNumber(9);
        // Then
        assertEquals("Fizz", result, "Expected Buzz when number is divisible by 3");
    }
    @Test
    @DisplayName("If the number is divisible by 5, return Buzz")
    public void test_whenTheNumberIsDivisibleByFive_thenReturnBuzz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // When
        String result = fizzbuzz.checkNumber(10);
        // Then
        assertEquals("Buzz", result, "Expected Buzz when number is divisible by 5");
    }
    @Test
    @DisplayName("If the number is divisible by 3 and 5, return Buzz")
    public void test_whenTheNumberIsMultipleByThreeAndFive_thenReturnFizzBuzz() {
        // Given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        // When
        String result = fizzbuzz.checkNumber(15);
        // Then
        assertEquals("FizzBuzz", result, "Expected FizzBuzz when number is divisible by 3 and 5");
    }
}