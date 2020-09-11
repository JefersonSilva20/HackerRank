import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int countMaxValue = 0;
        int maxValue = candles.get(0);
        for (Integer integer : candles) {
            if (integer > maxValue) {
                countMaxValue = 1;
                maxValue = integer;                            
            }else if(integer == maxValue){
                countMaxValue++;
            }
        }
        return countMaxValue;

    }

    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(Arrays.asList(new Integer[]{3, 2, 1,1, 3})));
    }
}
