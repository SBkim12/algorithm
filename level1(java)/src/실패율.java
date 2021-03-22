import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class 실패율 {

	public static void main(String[] args) {
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int N = 5;
		
		int[] pass = new int[5];
		int[] nope = new int[5];
		for(int i=0; i<stages.length; i++) {
			for(int j=0; j<N; j++) {
				if(j==stages[i]-1) {
					nope[j]++;
				}
				if(j<=stages[i]-1) {
					pass[j]++;
				}
				
			}
		}
		
		Map<Integer, Double> rMap = new HashMap<>();
		for(int i=0; i<N; i++) {
			rMap.put(i+1, nope[i]/(double)pass[i]);
		}
		
		int[] count = new int[N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i==j) {
					continue;
				}else {
					if(rMap.get(i)>=rMap.get(j)) {
						count[i]++;
					}
				}
				
			}
			
		}
		
		// 어려웡
		
//		for(int i=0; i<N; i++) {
//			System.out.println(i +  " : " +pass[i]);
//			System.out.println(i +  " : " +nope[i]);
//		}

	}

}
