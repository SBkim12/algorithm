package ���α׷��ӽ�_����_�ڵ�_ç����_����2;

public class level2 {

	public static void main(String[] args) {
		String s = "[(])";

		System.out.println(solution(s));
	}

	public static int solution(String s) {
		int answer = 0;

		
		for (int i = 0; i <s.length(); i++) {
			if (i > 0) {
				String f = Character.toString(s.charAt(0));
				s = s.substring(1);
				s += f;
			}
			boolean pass = true;
			int a = 0;
			int b = 0;
			int c = 0;
			System.out.println(s);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '[') {
					c++;
				} else if (s.charAt(j) == ']') {
					c--;
					if (c < 0) {
						pass = false;
						break;
					}
				} else if (s.charAt(j) == '{') {
					b++;
				} else if (s.charAt(j) == '}') {
					b--;
					if (b < 0) {
						pass = false;
						break;
					}
				} else if (s.charAt(j) == '(') {
					a++;
				} else if (s.charAt(j) == ')') {
					a--;
					if (a < 0) {
						pass = false;
						break;
					}
				}
			}
			if (pass == true & a==0 & b==0 & c==0) {
				System.out.println("���");
				answer++;
			}
		}

		return answer;
	}
}
