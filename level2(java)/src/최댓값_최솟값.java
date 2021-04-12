
public class ÃÖ´ñ°ª_ÃÖ¼Ú°ª {
	public String solution(String s) {
		String answer = "";

		String[] nums = s.split(" ");

		int max = -100000000;
		int min = 1000000000;

		for (int i = 0; i < nums.length; i++) {
			if (Integer.parseInt(nums[i]) > max) {
				max = Integer.parseInt(nums[i]);
			}

			if (Integer.parseInt(nums[i]) < min) {
				min = Integer.parseInt(nums[i]);
			}
		}

		answer = min + " " + max;

		return answer;
	}
}
