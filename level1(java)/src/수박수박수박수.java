
public class ���ڼ��ڼ��ڼ� {
	public String solution(int n) {
		int subak = n / 2;

		int namugi = n % 2;

		String answer = "";

		for (int i = 0; i < subak; i++) {
			answer = answer + "����";
		}

		if (namugi == 1) {
			answer = answer + "��";
		}

		return answer;
	}
}
