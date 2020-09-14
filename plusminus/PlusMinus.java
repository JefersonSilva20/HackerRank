package plusminus;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positiveNumber = 0, negativeNumber = 0, neutroNumber = 0;
        for (int i : arr) {
            if (i > 0) {
                positiveNumber++;
            } else if (i < 0) {
                negativeNumber++;
            } else {
                neutroNumber++;
            }
        }
        System.out.println((double)positiveNumber/arr.length);
        System.out.println((double)negativeNumber / arr.length);
        System.out.println((double)neutroNumber / arr.length);

    }

    public static void main(String[] args) throws Exception {
        plusMinus(new int[] { -4, 3, -9, 0, 4, 1 });
    }
}
