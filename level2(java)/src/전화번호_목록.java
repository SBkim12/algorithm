import java.util.Arrays;

public class ��ȭ��ȣ_��� {

	public static void main(String[] args) {
		String[] phone_book = { "119", "97674223", "119524421" };

		System.out.println(solution(phone_book));
	}
	
	//sort�� �����Ͽ� �յڸ� ���ص� �������� ���� �ʿ� ������ �����
	public static boolean solution(String[] phone_book) {
		boolean answer = true;

		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length-1; i++) {
			if (phone_book[i+1].startsWith(phone_book[i])) {
				return false;
			}
		}

		return answer;
	}

	// ȿ���� Ż��
	/*
	 * public static boolean solution(String[] phone_book) { boolean answer = true;
	 * 
	 * 
	 * for (int i = 0; i < phone_book.length; i++) { String main = phone_book[i];
	 * for (int j = 0; j < phone_book.length; j++) { if (i != j) { if
	 * (phone_book[j].startsWith(main)) { return false; } } } }
	 * 
	 * return answer; }
	 */

}
