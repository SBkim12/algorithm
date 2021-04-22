import java.util.Arrays;

public class 전화번호_목록 {

	public static void main(String[] args) {
		String[] phone_book = { "119", "97674223", "119524421" };

		System.out.println(solution(phone_book));
	}
	
	//sort로 정렬하여 앞뒤만 비교해도 나머지는 비교할 필요 없도록 만든다
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

	// 효율성 탈락
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
