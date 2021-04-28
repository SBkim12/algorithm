import java.util.HashMap;
import java.util.Map;

public class �ؽ� {

	public static void main(String[] args) {
		String[][] Clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(solution(Clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;
		
		Map<String, Integer> clothesMap = new HashMap<>();
		
		for(int i=0; i<clothes.length; i++) {
			//getOrDefault(Object key, V defaultValue)
			//ã�� Ű�� �����Ѵٸ� ã�� Ű�� ���� ��ȯ�ϰ� ���ٸ� �⺻ ���� ��ȯ�ϴ� �޼���
			clothesMap.put(clothes[i][1],clothesMap.getOrDefault(clothes[i][1],0)+1);
		}
		
		for(int val : clothesMap.values()) {
			//�ƹ��͵� ���� �ʴ� ���  +1
			answer*=(val+1);
		}
		
		//�ϳ��� ���� �ʴ� ���� ��� ���� ����
		return answer-1;
	}
}
