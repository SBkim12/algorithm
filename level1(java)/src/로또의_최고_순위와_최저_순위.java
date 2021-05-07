import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {
	public int[] solution(int[] lottos, int[] win_nums) {

		// 당첨이 될수도 아닐수 도 있는 값의 수
		int possible_no = 0;
		// 무조건 당첨이되는 값의 수
		int must_no = 0;

		for (int i = 0; i < lottos.length; i++) {
			int num = lottos[i];
			if (num != 0) {
				if (contains(win_nums, num)) {
					must_no++;
				}
			} else {
				possible_no++;
			}
		}

		// 등수 계산
		int min_rank = 7 - must_no;
		if (min_rank > 6) {
			min_rank = 6;
		}
		int max_rank = 7 - must_no - possible_no;
		if (max_rank > 6) {
			max_rank = 6;
		}

		int[] answer = { max_rank, min_rank };

		return answer;
	}
	
	public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
