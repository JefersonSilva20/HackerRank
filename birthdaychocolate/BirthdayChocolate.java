package birthdaychocolate;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        for (int i = 0; i < s.size() - m + 1; i++) { // 5X
            int tmpSum = 0;
            for (int j = i; j < i + m; j++) { //2x - 
                tmpSum += s.get(j);
            }
            if (tmpSum == d) {
                result++;
            }
        }
        return (result);
    }

    public static void main(String[] args) {
        // System.out.println("SOMA: " + birthday(Arrays.asList(4), 4, 1));
        System.out.println(birthday(Arrays.asList(1, 4, 1, 2, 3, 2, 2), 6, 3));
    }
}
