import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzzMethod(List<Integer> fizzBuzzList) {
        List<String> result = new ArrayList<>();

        if (fizzBuzzList.isEmpty()) return result;

        for (Integer number : fizzBuzzList) {
            boolean containsThree = number.toString().contains("3");
            boolean containsFive = number.toString().contains("5");

            if (number % 3 == 0 && number % 5 == 0 || containsThree && containsFive) {
                result.add("FizzBuzz");
            } else if (number % 5 == 0 || containsFive) {
                result.add("Buzz");
            } else if (number % 3 == 0 || containsThree) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(number));
            }
        }

        return result;
    }


}
