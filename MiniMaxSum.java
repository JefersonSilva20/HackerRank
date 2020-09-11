public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    // SEPARE OS PROBLEMAS EM MAIS FUNÇÕES!!!!

    static void miniMaxSum(int[] arr) {
        long minSum = Long.MAX_VALUE, maxSum = Long.MIN_VALUE;
        long currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    currentSum += arr[j];
                }
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            } if(currentSum < minSum) {
                minSum = currentSum;
            }
            currentSum = 0;
        }
        System.out.print(minSum + " " + maxSum);
    }
    
    public static void main(String[] args) {
        miniMaxSum(new int[] { 769082435, 210437958, 673982045, 375809214, 380564127 });
    }

}
