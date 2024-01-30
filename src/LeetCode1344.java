//angle between hands of a clock
public class LeetCode1344 {
    public static void main(String[] args) {
        int hour = 12;
        int minutes = 30;
        System.out.println(angleClock(hour,minutes));
    }
    public static double angleClock(int hour, int minutes) {
        float hourHand = (hour%12 + (float) minutes /60)*30;
        float minuteHand = minutes * 6.0f;
        double angle = Math.abs(hourHand-minuteHand);

        if (angle > 180) {
            return 360-angle;
        }
        return angle;
    }
}