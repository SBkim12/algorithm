import java.util.*;

public class 나누어떨어지는숫자배열 {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> lst = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				lst.add(arr[i]);
			}
		}
		Collections.sort(lst);

		int[] answer = { -1 };

		if (lst.size() > 0) {

			answer = new int[lst.size()];

			for (int i = 0; i < lst.size(); i++) {
				answer[i] = lst.get(i);
			}
		}

		return answer;
	}
}
