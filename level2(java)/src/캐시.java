import java.util.LinkedList;

public class ĳ�� {

	public static void main(String[] args) {
		int cacheSize = 0;
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		
		System.out.println(solution(cacheSize, cities));
	}
	static final int cache_hit = 1;
	static final int cache_miss = 5;
	
	// Ž�� �Ǵ� ������ ���� �ϴ� ��쿣 ArrayList�� ���
	// �������� �߰�/������ ���� ��� LinkedList�� ����ϴ� ���� �����ϴ�
	public static int solution(int cacheSize, String[] cities) {
		if(cacheSize == 0) return 5 * cities.length;
		
		int answer = 0;
        
        LinkedList<String> cache = new LinkedList<>();
        
        for(int i=0; i<cities.length; i++) {
        	String city = cities[i].toUpperCase();
        	
        	if(cache.remove(city)) {
        		cache.addFirst(city);
        		answer+=cache_hit;
        	}else {
        		
        		if(cache.size()==cacheSize) {
        			cache.pollLast();
        		}
        		
        		cache.addFirst(city);
        		answer+=cache_miss;
        	}
        }
        
        return answer;
    }
}
