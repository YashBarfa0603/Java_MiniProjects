import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;


public class PracticeSetAdvance {
    public static void main(String[] args) {
        // Question 1
        ArrayList<String>  ar = new ArrayList<>();
        ar.add("Student1");
        ar.add("Student2");
        ar.add("Student3");
        ar.add("Student4");
        ar.add("Student5");
        ar.add("Student6");
        ar.add("Student7");
        ar.add("Student8");
        ar.add("Student9");
        ar.add("Student10");
        for (Object o: ar){
            System.out.println(o);
        }
        // Question 2
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));

        // Question 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR) + ":"+ c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // Question 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);
        // Question 5
        HashSet <Integer> s = new HashSet<>();
        s.add(4);
        s.add(4);
        s.add(5);
        s.add(9);
        s.add(2);
        s.add(7);
        System.out.println(s);
    }
}
