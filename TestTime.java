import java.time.LocalTime;

public class TestTime {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(10, 0, 0);
        LocalTime t2 = LocalTime.of(12, 30, 0);
        System.out.println("Seconds between t1 and t2: " + Time.secondsBetween(t1, t2));
        System.out.println("Seconds in a day: " + Time.secondsInDay());
    }
}