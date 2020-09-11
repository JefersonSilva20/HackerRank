import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String time = " ";
        String hourFormated = s.substring(0, 8).concat(" ").concat(s.substring(8));
        SimpleDateFormat return24Format = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat display12Format = new SimpleDateFormat("hh:mm:ss a");
        try {
            time = return24Format.format(display12Format.parse(hourFormated)).toString();
        } catch (ParseException e) {

        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("13:05:00PM"));
    }
}
