
public class ÇÏ»þµå¼ö {

	public boolean solution(int x) {
		boolean answer = true;
		int boksa = x;
		int hap = 0;
		while (boksa >= 1) {
			hap += boksa % 10;
			boksa /= 10;
		}
		if (x % hap != 0) {
			answer = false;
		}

		return answer;
	}

}
