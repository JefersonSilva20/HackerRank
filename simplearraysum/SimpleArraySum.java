package simplearraysum;

import java.io.IOException;

public class SimpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int result = 0;
        for (int i : ar) {result+=i;}
        return result;

    }

    public static void main(String[] args) throws IOException {
        System.out.println(simpleArraySum(new int[]{1,2,3}));
    }
}
