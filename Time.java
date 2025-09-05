import java.time.LocalTime;
import java.time.Duration;

public class Time {
    public static long secondsBetween(LocalTime t1, LocalTime t2) {
        return Duration.between(t1, t2).getSeconds();
    }

    public static int secondsInDay() {
        return 24 * 60 * 60;
    }
}