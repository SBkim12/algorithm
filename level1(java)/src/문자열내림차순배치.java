import java.util.Arrays;
import java.util.Collections;

public class ���ڿ�����������ġ {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		
		String[] S = s.split("");
		
		Arrays.sort(S,Collections.reverseOrder());
		
		String answer = String.join("",S);
		
		System.out.println(answer);
	}

}
