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

    // Result list
    List<String> resultArray = new ArrayList<>();

    @Test
    public void should_return_empty_array() {
        resultArray = fizzBuzz.fizzBuzzMethod(emptyList);
        assertEquals(emptyList, resultArray);
    }

    @Test
    public void should_return_fizz_in_3rd_array_position() {
        oneToThreeList.add(1);
        oneToThreeList.add(2);
        oneToThreeList.add(3);
        List<String> expected = List.of("1", "2", "Fizz");
        List<String> result = fizzBuzz.fizzBuzzMethod(oneToThreeList);
        assertEquals(expected, result);
    }

}