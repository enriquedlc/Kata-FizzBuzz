import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzzMethod(List<Integer> fizzBuzzList) {
        List<String> result = new ArrayList<>();

        if (fizzBuzzList.isEmpty()) return result;

        for (Integer number : fizzBuzzList) {
            if (number % 3 == 0 && number % 5 == 0) {
                result.add("FizzBuzz");
            } else if (number % 3 == 0) {
                result.add("Fizz");
            } else if (number % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(number));
            }
        }

        return result;
    }


}
