import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {

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
        
        //내림차순 정렬
        //Comparable : 객체 간의 일반적인 정렬이 필요할 때, Comparable 인터페이스를 확장해서 정렬의 기준을 정의하는 compareTo() 메서드를 구현한다.
        //Comparator : 객체 간의 특정한 정렬이 필요할 때, Comparator 인터페이스를 확장해서 특정 기준을 정의하는 compare() 메서드를 구현한다.
        Arrays.sort(str, new Comparator<String>() {
        	@Override
        	public int compare(String a, String b) {
        		return (b+a).compareTo(a+b);
        	}
        });
        
        //맨 앞자리가 0일 경우 나머지도 0 000 = 0
        if(str[0].equals("0")) {
        	return "0";
        }
        
        for(String s : str) {
        	answer+=s;
        }
        
        return answer;
    }

}
