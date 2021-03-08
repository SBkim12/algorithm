
public class 문자열다루기기본 {
	public boolean solution(String s) {
		boolean answer = true;
		if (!(s.length() == 4 || s.length() == 6)) {
			answer = false;
		}
		for (int i = 0; i < s.length(); i++) {
			if (!((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)) {
				answer = false;
			}
		}
		return answer;
	}
}
