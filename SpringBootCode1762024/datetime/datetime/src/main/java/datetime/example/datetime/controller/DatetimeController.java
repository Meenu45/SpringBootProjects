package datetime.example.datetime.controller;


    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.time.LocalTime;
    import java.time.format.DateTimeFormatter;
    import java.util.HashMap;
    import java.util.Map;

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;
@RestController
public class DatetimeController {

    @GetMapping("/datetime")
    public Map<String,String> getDateTime() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");

        Map<String, String> response = new HashMap<>();
        response.put(" Current date and Time", now.format(formate));

        return response;
    }}
//    @GetMapping("/datetime")
//    public String getDateTime(){
//            normal formating
//        return"<h2> Spring Boot Date and Time </h2>"
//                +"<p><b>Date:</b>" + LocalDate.now() + "</p>"
//                +"<p><b>Time:</b>" + LocalTime.now() + "</p>"
//                +"<p><b>Date & Time: </b>" + LocalDateTime.now() + "</p>";


//        formatting
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
//
//        return "Current Date and Time : " + now.format(formate);

//        Json


//    }
//}
