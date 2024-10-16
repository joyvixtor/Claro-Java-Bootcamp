import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
    private Set<Integer> uniqueNumbers;

    public RandomNumber() {
        uniqueNumbers = new HashSet<>();
    }

    public int generateRandomNumber(){
        Random random = new Random();
        int number;

        do{
            number = 1000000 + random.nextInt(9000000);
        } while (uniqueNumbers.contains(number));

        uniqueNumbers.add(number);
        return number;
    }
}
