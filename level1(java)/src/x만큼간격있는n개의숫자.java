import java.util.Scanner;

public class x만큼간격있는n개의숫자 {
	public static long[] solution(long x, int n) {
		Scanner sc = new Scanner(System.in);
		long[] answer = new long[n];

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				answer[i] = x;
			} else {
				answer[i] = x * (i + 1);
			}
		}
		return answer;
		
	}
}

