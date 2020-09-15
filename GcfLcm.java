public class GcfLcm {

    //algorimo do MDC
    public static int mdc(int dividendo, int divisor) {
        if ((dividendo % divisor == 0)) {
            return divisor;
        } else {
            return mdc(divisor, (dividendo % divisor));
        }
    }

    //Algoritmo do MMC
    private static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }

    public static void main(String[] args) {
        System.out.println(mdc(2, 4));
        System.out.println(mmc(36, 14));
    }

}
