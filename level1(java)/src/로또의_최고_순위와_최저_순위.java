import java.util.Arrays;

public class �ζ���_�ְ�_������_����_���� {
	public int[] solution(int[] lottos, int[] win_nums) {

		// ��÷�� �ɼ��� �ƴҼ� �� �ִ� ���� ��
		int possible_no = 0;
		// ������ ��÷�̵Ǵ� ���� ��
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

		// ��� ���
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
