import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzzMethod(List<Integer> fizzBuzzList) {
        try {
            if (fizzBuzzList.isEmpty()) throw new Exception("Empty list");

            for (int i = 0; i < fizzBuzzList.size(); i++) {
                if (i % 3 == 0) System.out.println("Fizz");
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return null;
    }

}
