import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int currentHour = Integer.valueOf(st.nextToken());
		int currentMinute = Integer.valueOf(st.nextToken());
		int totalCookingTime = Integer.valueOf(br.readLine());

		int cookingHour = totalCookingTime / 60;
		int cookingMinute = totalCookingTime % 60;

		int printHour = currentHour + cookingHour;
		int printMinute = currentMinute + cookingMinute;

		if (printMinute >= 60) {
			printHour++;
			printMinute = printMinute - 60;
		}

		if (printHour > 23) {
			printHour = printHour - 24;
		}

		System.out.println(printHour + " " + printMinute);
	}
}
