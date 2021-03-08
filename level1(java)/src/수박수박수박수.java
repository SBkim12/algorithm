
public class 수박수박수박수 {
	public String solution(int n) {
		int subak = n / 2;

		int namugi = n % 2;

		String answer = "";

		for (int i = 0; i < subak; i++) {
			answer = answer + "수박";
		}

		if (namugi == 1) {
			answer = answer + "수";
		}

		return answer;
	}
}
