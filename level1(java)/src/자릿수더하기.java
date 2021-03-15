
public class 자릿수더하기 {
	public int solution(int n) {
		int answer = 0;

		while (n >= 1) {
			if (n >= 100000000) {
				answer += n / 100000000;
				n %= 100000000;
			} else if (n >= 10000000) {
				answer += n / 10000000;
				n %= 10000000;
			} else if (n >= 1000000) {
				answer += n / 1000000;
				n %= 1000000;
			} else if (n >= 100000) {
				answer += n / 100000;
				n %= 100000;
			} else if (n >= 10000) {
				answer += n / 10000;
				n %= 10000;
			} else if (n >= 1000) {
				answer += n / 1000;
				n %= 1000;
			} else if (n >= 100) {
				answer += n / 100;
				n %= 100;
			} else if (n >= 10) {
				answer += n / 10;
				n %= 10;
			} else {
				answer += n;
				n /= 10;
			}
		}

		return answer;
	}
}
