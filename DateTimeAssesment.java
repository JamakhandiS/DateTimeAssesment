import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Scanner;

public class DateTimeAssesment {
    public static String convert(String time1) {
        try {
            DateFormat df1 = new SimpleDateFormat("hh:mm aa");
            DateFormat df2 = new SimpleDateFormat("HH:mm");

            java.util.Date date = df1.parse(time1);
            return df2.format(date);
        } catch (ParseException e) {
            System.out.println("Invalid time format. Please use hh:mm aa format.");
            return ""; 
        }
    }

    public static void main(String[] args) {
        String time = "03:18 PM";
        String time2 = convert(time);
        System.out.println("24-hour time: " + time2);
    }
}
