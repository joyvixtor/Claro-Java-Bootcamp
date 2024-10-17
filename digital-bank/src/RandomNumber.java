import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumber {
    
    private final Set<Integer> UNIQUE_NUMBERS;
    private final int NUMBER_SIZE;

    public RandomNumber(int NUMBER_SIZE) {
        UNIQUE_NUMBERS = new HashSet<>();
        this.NUMBER_SIZE = NUMBER_SIZE;
    }

    public int generateRandomNumber() {
        Random random = new Random();
        int number;
        
        switch (this.NUMBER_SIZE) {
            case 7:
                do {
                    number = 1000000 + random.nextInt(9000000);
                } while (verifyAccountNumber(number));
                UNIQUE_NUMBERS.add(number);
                return number;
            case 1:
                do {
                    number = 1 + random.nextInt(10);
                } while(verifyAccountNumber(number));
                UNIQUE_NUMBERS.add(number);
                return number;
                
            default:
                throw new IllegalArgumentException("Unsupported number size: " + NUMBER_SIZE);
        }
    }

    public boolean verifyAccountNumber(int number){
        return UNIQUE_NUMBERS.contains(number);
    }
}
