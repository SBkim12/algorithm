
public class 카펫 {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		int[] answer = solution(brown, yellow);
		System.out.println("가로 :: " + answer[0]);
		System.out.println("세로 :: " + answer[1]);
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int limit = (int) Math.ceil(Math.sqrt(yellow));

		for (int i = 1; i <= limit; i++) {
			if (yellow % i == 0) {
				answer[0] = yellow / i;
				answer[1] = i;
			} else {
				continue;
			}
			
			//여러 줄일경우
			if (answer[0] * 2 + answer[1] * 2 + 4 == brown) {
				answer[0] += 2;
				answer[1] += 2;
				return answer;
			}

		}
		//한줄일 경우
		answer[0] = yellow + 2;
		answer[1] = 3;
		
		return answer;
	}

}
