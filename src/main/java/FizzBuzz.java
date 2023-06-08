import java.util.List;

public class FizzBuzz {

    public List<String> fizzBuzz(List<Integer> fizzBuzzList) {
        try {
            if (fizzBuzzList.isEmpty()) throw new Exception("Empty list");

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return null;
    }

}
