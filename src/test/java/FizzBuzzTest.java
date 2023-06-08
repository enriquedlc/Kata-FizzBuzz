import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

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

    @Test
    public void emptyParamArray() {
        fizzBuzz.fizzBuzz(emptyList);
    }

    public static void main (String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        // Example 1
        fizzBuzzTest.emptyParamArray();

    }

}