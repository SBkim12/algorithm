import java.util.Arrays;

public class ���������������ι�ġ�ϱ� {

	public static void main(String[] args) {
		
		int n = 118372;
		
		long answer = 0;

		String trans = Long.toString(n);
		
		String[] no = trans.split("");

		Arrays.sort(no);

		trans = "";

		for (int i = no.length-1; i >=0 ; i--) {
			trans += no[i];
		}

		answer = Long.valueOf(trans);
		
	}

}
