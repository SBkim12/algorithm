
public class ¿Ã¹Ù¸¥_°ýÈ£ {

	public static void main(String[] args) {
		
		String s = "(())()";
		
		System.out.println(solution(s));
	}
	
	
	private static boolean solution(String s) {
        boolean answer = true;
        
        int hap = 0;
        for(int i=0; i<s.length(); i++){
        	if(s.charAt(i)=='(') {
        		hap++;
        	}else {
        		hap--;
        	}
        	if(hap<0) {
        		answer = false;
        		break;
        	}
        }
        if(hap>0) {
        	answer= false;
        }

        return answer;
    }

}
