import java.util.ArrayList;
import java.util.Random;

public class Calculator {

    private Random random;
    private int nextInt;

    public Calculator(){
        this.random  = new Random();
        this.nextInt = random.nextInt();
    }

    public int add(ArrayList<Integer> numbers ){
       int result = 0;
       for(int number : numbers){
            result += number;
        }
        return result;
    }

    public int multiply(ArrayList<Integer> numbers) {
        int result = 1;
        for(int number : numbers){
            result *= number;
        }
        return result;
    }

   public int multiplyByRandom(int number) {
     int result = nextInt * number;
     nextInt = random.nextInt();
     return result;

   }
}
