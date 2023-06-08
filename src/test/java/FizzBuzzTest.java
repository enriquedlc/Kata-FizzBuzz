import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTest {

    /**
     * Test of fizzBuzz method, of class FizzBuzz.
     *
     * @Example 1
     * @Param Integer[]
     * @Return String[]
     *
     * @Example 2
     * @Param Integer[1, 2, 3]
     * @Return String["1", "2", "Fizz"]
     *
     * @Example 3
     * @Param Integer[1, 2, 3, 4, 5]
     * @Return String["1", "2", "Fizz", "4", "Buzz"]
     *
     * @Example 4
     * @Param Integer[1, 2, 3, 4, 5, ... 100]
     * @Return String[1, 2, Fizz, 4, Buzz, ... 100]
     */

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    // Result list
    List<String> result = new ArrayList<>();

    @Test
    public void should_return_empty_array() {
        result = fizzBuzz.fizzBuzzMethod(List.of());
        assertEquals(List.of(), result);
    }

    @Test
    public void should_return_fizz_if_number_divisible_by_three() {
        List<Integer> oneToThreeList = List.of(1, 2, 3);
        List<String> expected = List.of("1", "2", "Fizz");
        result = fizzBuzz.fizzBuzzMethod(oneToThreeList);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_fizz_if_number_divisible_by_five() {
        List<Integer> oneToFiveList = List.of(1, 2, 3, 4, 5);
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        result = fizzBuzz.fizzBuzzMethod(oneToFiveList);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_entire_list_correct_until_twenty() {
        List<Integer> oneToTwentyList = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            oneToTwentyList.add(i);
        }
        List<String> expected = List.of(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "Fizz", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"
                // ... continue the pattern up to 100
        );
        result = fizzBuzz.fizzBuzzMethod(oneToTwentyList);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_fizz_if_number_contains_three() {
        List<Integer> oneToOneHundredList = List.of(1, 23, 33, 44, 43, 55, 73);
        List<String> expected = List.of("1", "Fizz", "Fizz", "44", "Fizz", "Buzz", "Fizz");
        result = fizzBuzz.fizzBuzzMethod(oneToOneHundredList);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_fizz_if_number_contains_five() {
        List<Integer> oneToOneHundredList = List.of(1, 52, 53, 55, 73);
        List<String> expected = List.of("1", "Buzz", "FizzBuzz", "Buzz", "Fizz");
        result = fizzBuzz.fizzBuzzMethod(oneToOneHundredList);
        assertEquals(expected, result);
    }

}