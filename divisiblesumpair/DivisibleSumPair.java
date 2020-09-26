package divisiblesumpair;

public class DivisibleSumPair {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (((ar[i] + ar[j]) % k) == 0) {
                    System.out.println(ar[i] + " + " + ar[j]);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, new int[] { 1, 3, 2, 6, 1, 2 }));
    }
}
