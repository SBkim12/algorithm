
public class 정수사이의합 {
	public long solution(int a, int b) {
		long answer = 0;
		if (a > b) {
			answer = (long) a * (a + 1) / 2 - (long) b * (b - 1) / 2;
		} else {
			answer = (long) b * (b + 1) / 2 - (long) a * (a - 1) / 2;
		}

		return answer;
	}
}
