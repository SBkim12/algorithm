
public abstract class �űԾ��̵���õ {

	public static void main(String[] args) {
		String new_id = 	"...!@BaT#*..y.abcdefghijklm";

		// �ҹ��� ��ȯ
		new_id = new_id.toLowerCase();

		// �ʿ��� ���ڸ� �����(����, �ҹ���, - , _ , . )
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

		// ���ӵ� . ����
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

		// ó���̳� �������� . ����
		if(id.startsWith(".") ) {
			id = id.substring(1, id.length());
		} else if(id.endsWith(".")) {
			id = id.substring(0, id.length()-1);
		}

		System.out.println(id);

		// ������̶�� a�� ä���
		if(id.length() == 0) {
			id += "a";
		}

		// 16�� �̻�� 15���ڱ��� ¥����
		if(id.length() >= 16) {
			id = id.substring(0, 15);
		}
		
		if(id.endsWith(".")) {
			id = id.substring(0, id.length()-1);
		}

		// 2�� ���϶�� ������ ���ڷ� 3���� �̻����� �����
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
