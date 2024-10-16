import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
    
    private Set<Integer> uniqueNumbers;
    private int numberSize;

    public RandomNumber(int numberSize) {
        uniqueNumbers = new HashSet<>();
        this.numberSize = numberSize;
    }

    public int generateRandomNumber() {
        Random random = new Random();
        int number;
        
        switch (this.numberSize) {
            case 7:
                do {
                    number = 1000000 + random.nextInt(9000000);
                } while (uniqueNumbers.contains(number));
                uniqueNumbers.add(number);
                return number;
            case 5:
                do {
                    number = 10000 + random.nextInt(90000);
                } while(uniqueNumbers.contains(number));
                uniqueNumbers.add(number);
                return number;
                
            default:
                throw new IllegalArgumentException("Unsupported number size: " + numberSize);
        }
    }
}
