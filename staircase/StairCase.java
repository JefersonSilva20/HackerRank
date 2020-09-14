package staircase;

public class StairCase {

    static void staircase(int n) {
        String p = "";
        for(int i = 0 ; i< n ; i++){
            p = p + "#";
            System.out.printf("%"+n+"s\n", p);
           
        }
        //Java 11
        /*for (int i = 0; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.print("#".repeat(i));
            System.out.println("");
        }*/

    }

    public static void main(String[] args) {
        staircase(6);
    }
}
