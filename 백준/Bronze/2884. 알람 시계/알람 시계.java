import java.util.Scanner;

public class Main {
	public static final int MAX_MINUTE = 60;
	public static final int MAX_HOUR = 23;
	public static final int ALARM_MINUTE = 45;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt();

		int alarm_hour, alarm_minute;

		if(minute >= ALARM_MINUTE) {
			alarm_hour = hour;
			alarm_minute = minute - ALARM_MINUTE;
		} else {
				alarm_minute = MAX_MINUTE - (ALARM_MINUTE - minute);
			if (hour - 1 >= 0) {
				alarm_hour = hour - 1;
			} else {
				alarm_hour = MAX_HOUR;
			}
		}

		print_alarm(alarm_hour, alarm_minute);

	}

	public static void print_alarm(int alarm_hour, int alarm_minute) {
		System.out.println(alarm_hour + " " + alarm_minute);
	}
}