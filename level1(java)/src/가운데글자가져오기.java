
public class ������ڰ������� {
	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 == 0) {
			int start = s.length() / 2 - 1;
			answer = s.substring(start, start + 2);
		} else {
			int ans = s.length() / 2;
			answer = s.substring(ans, ans + 1);
		}

		return answer;
	}
}
