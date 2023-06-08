import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

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

    private FizzBuzz fizzBuzz = new FizzBuzz();

    // Lists
    private List emptyList = new ArrayList<Integer>();

    private List oneToThreeList = new ArrayList<Integer>();

    private List oneToFiveList = new ArrayList<Integer>();

    // Result list
    List<String> result = new ArrayList<>();

    @Test
    public void should_return_empty_array() {
        result = fizzBuzz.fizzBuzzMethod(emptyList);
        assertEquals(emptyList, result);
    }

    @Test
    public void should_return_fizz_in_3rd_array_position() {
        oneToThreeList = List.of(1, 2, 3);
        List<String> expected = List.of("1", "2", "Fizz");
        result = fizzBuzz.fizzBuzzMethod(oneToThreeList);
        assertEquals(expected, result);
    }

    @Test
    public void should_return_buzz_in_5th_array_position() {
        oneToFiveList = List.of(1, 2, 3, 4, 5);
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        result = fizzBuzz.fizzBuzzMethod(oneToFiveList);
        assertEquals(expected, result);
    }

}