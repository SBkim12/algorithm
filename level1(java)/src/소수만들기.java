import java.util.ArrayList;
import java.util.List;

public class 소수만들기 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		
		List<Integer> lst = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int e = j + 1; e < nums.length; e++) {
					int hap = nums[i] + nums[j] + nums[e];
					lst.add(hap);
					System.out.println(hap);
				}
			}
		}
		int answer = lst.size();
		for (int a = 0; a < lst.size(); a++) {
			for (int che = 2; che * che <= lst.get(a); che++) {
				if (lst.get(a) % che == 0) {
					answer--;
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
