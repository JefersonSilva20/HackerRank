package drawingbook;

public class DrawingBook {

    static int pageCount(int n, int p) {
        int leftPageInit = 0;
        int rightPageInit = 1;
        int countInit = 0;
        int rightPageLast = ((n % 2) == 0) ? n + 1 : n;
        int leftPageLast = rightPageLast - 1;
        int countLast = 0;
        for (int i = 0; i <= n; i += 2) {
            if ((leftPageInit < p) && (rightPageInit < p ))  {
                countInit++;
                leftPageInit+=2;
                rightPageInit+=2;
            }
            if ((leftPageLast > p) && (rightPageLast > p ))  {
                countLast++;
                leftPageLast-=2;
                rightPageLast-=2;
            }
        }
        return Integer.min(countInit, countLast);

    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
    }
}
