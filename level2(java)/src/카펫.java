
public class ī�� {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		int[] answer = solution(brown, yellow);
		System.out.println("���� :: " + answer[0]);
		System.out.println("���� :: " + answer[1]);
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
			
			//���� ���ϰ��
			if (answer[0] * 2 + answer[1] * 2 + 4 == brown) {
				answer[0] += 2;
				answer[1] += 2;
				return answer;
			}

		}
		//������ ���
		answer[0] = yellow + 2;
		answer[1] = 3;
		
		return answer;
	}

}
