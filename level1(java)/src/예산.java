import java.util.Arrays;

public class ¿¹»ê {

	public static void main(String[] args) {
		
		int[] d = {1,3,2,5,4};
		int budget = 9;
		int answer = 0;
		
		Arrays.sort(d);
		
		for(int i=0; i<d.length; i++) {
			if(budget>d[i]) {
				budget-=d[i];
				answer++;
			}else {
				break;
			}
		}
		
		System.out.println(answer);
	}

}
