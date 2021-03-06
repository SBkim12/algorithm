import java.util.*;

public class 같은숫자는싫어 {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		int have = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == have) {

			} else {
				list.add(arr[i]);
				have = arr[i];
			}
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
