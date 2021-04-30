import java.util.Arrays;
import java.util.Comparator;

public class ����_ū_�� {

	public static void main(String[] args) {
		
	int[] numbers = {3, 30, 34, 5, 9};	
	
	System.out.println(solution(numbers));
	
	}
	
	public static String solution(int[] numbers) {
        
		String answer = "";
		
        String[] str = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
        	str[i] = String.valueOf(numbers[i]);
        }
        
        //�������� ����
        //Comparable : ��ü ���� �Ϲ����� ������ �ʿ��� ��, Comparable �������̽��� Ȯ���ؼ� ������ ������ �����ϴ� compareTo() �޼��带 �����Ѵ�.
        //Comparator : ��ü ���� Ư���� ������ �ʿ��� ��, Comparator �������̽��� Ȯ���ؼ� Ư�� ������ �����ϴ� compare() �޼��带 �����Ѵ�.
        Arrays.sort(str, new Comparator<String>() {
        	@Override
        	public int compare(String a, String b) {
        		return (b+a).compareTo(a+b);
        	}
        });
        
        //�� ���ڸ��� 0�� ��� �������� 0 000 = 0
        if(str[0].equals("0")) {
        	return "0";
        }
        
        for(String s : str) {
        	answer+=s;
        }
        
        return answer;
    }

}
