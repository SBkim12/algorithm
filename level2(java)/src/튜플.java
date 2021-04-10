import java.util.Comparator;
import java.util.PriorityQueue;

public class 튜플 {

	public static void main(String[] args) {
		String s = 	"{{2},{2,1},{2,1,3},{2,1,3,4}}";
		
		int[] a = solution(s);
		for(int b : a) {
			System.out.println(b);
		}
	}

	public static int[] solution(String s) {
		
		
		//문자열 정제
		s = s.substring(1, s.length()-1).replace("{", "");
		String[] str = s.split("}");
		
		// 길이가 작은 순으로 정렬해주는 PriorityQueue( 다른 사람이 만든 거 참조) 
		PriorityQueue<String[]> pq = new PriorityQueue<>(new Comparator<String[]>() { 
			@Override public int compare(String[] o1, String[] o2) { 
				if (o1.length<o2.length) 
					return -1; 
				else 
					return 1; 
				} 
			}
		);

		
		for(int i=0; i<str.length; i++) {
			if(str[i].charAt(0)==',') {
				str[i] = str[i].substring(1);
			}
			
			String[] str2 = str[i].split(",");
			
			pq.add(str2);
		}
		
		int[] answer = new int[pq.size()];
		int i = 0;
		
		while(pq.size()>0) {
			String[] ex = pq.poll();
			boolean have = true;
			
			for(int j=0; j<ex.length; j++) {
				
				for(int e=0; e<answer.length; e++) {
					if(answer[e]==Integer.parseInt(ex[j])) {
						have=true;
						break;
					}else {
						have=false;
					}
				}
				
				if(have==false) {
					answer[i]=Integer.parseInt(ex[j]);
					i++;
					break;
				}
			}
			
			
		}
		
		return answer;
	}
	
}
