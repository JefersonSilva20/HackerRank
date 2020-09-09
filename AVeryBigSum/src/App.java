public class App {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (long l : ar) result+=l;
        return result;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(aVeryBigSum(new long[]{1000000001l, 1000000002l, 1000000003l, 1000000004l, 1000000005l}));
    }
}
