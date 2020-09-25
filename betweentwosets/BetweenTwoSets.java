package betweentwosets;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
     */

    //  GCF algorithms
    public static int gcf(int dividend, int divisor) {
        if ((dividend % divisor == 0)) {
            return divisor;
        } else {
            return gcf(divisor, (dividend % divisor));
        }
    }

    // LMC algorithms
    private static int lmc(int a, int b) {
        return a * (b / gcf(a, b));
    }

    static int findLCM(List<Integer> arr) {
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            result = lmc(result, arr.get(i));
        }
        return result;
    }

    static int findGCF(List<Integer> arr) {
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            result = gcf(result, arr.get(i));
        }
        return result;
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int finalCount = 0;

        int lcm = findLCM(a);

        int gcf = findGCF(b);
        for (int i = lcm, j = 2; i <= gcf; i = lcm * j, j++) {
            if (gcf % i == 0) {
                finalCount++;
            }
        }

        return finalCount;
    }

    public static void main(String[] args) {
        int result = getTotalX(Arrays.asList( 2, 4 ), Arrays.asList( 16, 32, 96 ));
        System.out.println(result);
    }

}
