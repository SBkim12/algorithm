import java.util.HashMap;
import java.util.Map;

public class 해쉬 {

	public static void main(String[] args) {
		String[][] Clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(Clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		
		Map<String, Integer> clothesMap = new HashMap<>();
		
		for(int i=0; i<clothes.length; i++) {
			//getOrDefault(Object key, V defaultValue)
			//찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
			clothesMap.put(clothes[i][1],clothesMap.getOrDefault(clothes[i][1],0)+1);
		}
		
		for(int val : clothesMap.values()) {
			//아무것도 입지 않는 경우  +1
			answer*=(val+1);
		}
		
		//하나도 입지 않는 경우는 고려 하지 않음
		return answer-1;
	}
}
