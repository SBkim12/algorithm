import java.util.Scanner;

public class x��ŭ�����ִ�n���Ǽ��� {
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

