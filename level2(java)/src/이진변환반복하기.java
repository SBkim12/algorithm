
public class 이진변환반복하기 {

	public static void main(String[] args) {
		
		String s = "110010101001";
		
		solution(s);
	}
	
	public static int[] solution(String s) {
        
        int zero = 0;
        int no = 0;
        while(!s.equals("1")) {
        	
        	//s의 0의 개수를 구해서 반환 될 변수에 더하기
        	zero += s.length() - s.replace("0", "").length();
        	
        	//0 지우기
        	s = s.replace("0", "");
        	
        	//s의 길이로 2진수 만들기
        	s=Integer.toBinaryString(s.length());
        	
        	//2진변환 횟수 +1
        	no++;
        }
        
        int[] answer = {no, zero};
        
        System.out.println(zero);
        System.out.println(no);
        
        return answer;
    }

}
