public class 다리를지나는트럭 {

	public static void main(String[] args) {

		int weight = 100;
		int[] truck_weights = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		int bridge_length = 100;

		System.out.println(solution(bridge_length, weight, truck_weights));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {

		int[] pass = new int[truck_weights.length];
		int time = 0;
		int heavy = 0;
		int passing = 0;
		int passed = 0;
		while (passed < truck_weights.length) {
			time++;
			if (heavy < weight && passing < truck_weights.length) {
				if (heavy + truck_weights[passing] <= weight) {
					heavy += truck_weights[passing];
					passing++;
				}
			}
			for (int i = passed; i < passing; i++) {
				pass[i]++;
				if (pass[i] == bridge_length) {
					passed++;
					heavy -= truck_weights[i];
				}
			}
		}

		return time + 1;
	}
}