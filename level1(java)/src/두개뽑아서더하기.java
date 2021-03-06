import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 두개뽑아서더하기 {
	public int[] solution(int[] numbers) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int hap = numbers[i] + numbers[j];
				if (!list.contains(hap)) {
					list.add(hap);
				}
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);

		return answer;
	}
}
