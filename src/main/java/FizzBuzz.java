import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzzMethod(List<Integer> fizzBuzzList) {
        List<String> result = new ArrayList<>();

        if (fizzBuzzList.isEmpty()) return result;

        for (Integer number : fizzBuzzList) {
            boolean divisibleByThree = number % 3 == 0;
            boolean containsThree = number.toString().contains("3");
            boolean divisibleByFive = number % 5 == 0;
            boolean containsFive = number.toString().contains("5");

            if (divisibleByThree && divisibleByFive || containsThree && containsFive) {
                result.add("FizzBuzz");
            } else if (divisibleByFive || containsFive) {
                result.add("Buzz");
            } else if (divisibleByThree || containsThree) {
                result.add("Fizz");
            } else {
                result.add(String.valueOf(number));
            }
        }

        return result;
    }


}
