package section01.basic;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ThreeDice {
	public static void main(String[] args) throws IOException {
		// 주사위 3개

		// 같은 눈 3개 10000 + (n * 1000), n = 눈금
		// 같은 눈 2개 1000 + (n * 100)
		// a = b, a != c
		// a = c, a != b
		// b = c, a != b
		// 모두 다른 눈 max * 100, max = 세개 중 가장 큰 눈금

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		int result = 0;

		if(a == b && b == c) { // a = b = c
			result = 10000 + (a * 1000);
		} else if(a == b && a != c) {  // a = b, a!c
			result = 1000 + (a * 100);
		} else if(a == c && a != b) {
			result = 1000 + (a * 100);
		} else if(b == c && a != b) {
			result = 1000 + (b * 100);
		} else {
			int max = a;

			if(max < b && b > c) {		// a < b
				max = b;
			} else if(max < c && b < c) {
				max = c;
			}

			result = max * 100;
		}

		System.out.println(result);
	}
}
