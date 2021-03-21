
public abstract class 신규아이디추천 {

	public static void main(String[] args) {
		String new_id = 	"...!@BaT#*..y.abcdefghijklm";

		// 소문자 변환
		new_id = new_id.toLowerCase();

		// 필요한 문자만 남기기(숫자, 소문자, - , _ , . )
		String id = "";
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				id += String.valueOf(ch);
			} else if (ch >= '0' && ch <= '9') {
				id += String.valueOf(ch);
			} else if (ch == '.' || ch == '-' || ch == '_') {
				id += String.valueOf(ch);
			}
		}

		System.out.println(id);

		// 연속된 . 제거
		for (int i = 0; i < id.length(); i++) {
			if (id.charAt(i) == '.') {
				int j = i + 1;
				String dot = ".";

				while (j != id.length() && id.charAt(j) == '.') {
					dot += ".";
					j++;
				}

				if (dot.length() > 1)
					id = id.replace(dot, ".");
			}
		}

		System.out.println(id);

		// 처음이나 마지막의 . 제거
		if(id.startsWith(".") ) {
			id = id.substring(1, id.length());
		} else if(id.endsWith(".")) {
			id = id.substring(0, id.length()-1);
		}

		System.out.println(id);

		// 빈공간이라면 a로 채우기
		if(id.length() == 0) {
			id += "a";
		}

		// 16자 이상시 15문자까지 짜르기
		if(id.length() >= 16) {
			id = id.substring(0, 15);
		}
		
		if(id.endsWith(".")) {
			id = id.substring(0, id.length()-1);
		}

		// 2자 이하라면 마지막 글자로 3글자 이상으로 만들기
		String last = id.charAt(id.length()-1) + "";
		if(id.length() == 2) {
			id = id + last;
		} else if(id.length() == 1) {
			id = id + last + last;
		}
		
		String answer = id;

		System.out.println(answer);

	}

}
