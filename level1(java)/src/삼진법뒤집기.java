import java.util.ArrayList;
import java.util.List;

public class ������������ {

	public static void main(String[] args) {
		int n = 125;
		int answer =0;
		List<Integer> N = new ArrayList<Integer>();
		while(n>=1) {
			N.add(n%3);
			n/=3;
		}
		System.out.println(N);
		int gob =1;
		for(int j=N.size()-1; j>=0; j--) {
			answer += N.get(j)*gob;
			gob*=3;
		}
		System.out.println(answer);
	}

}
