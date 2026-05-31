import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Q3Date {
    public static void main(String[] args) {
        String date = LocalDate
                .now()
//                .parse("2025-05-31")
                .format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date);
    }
}

