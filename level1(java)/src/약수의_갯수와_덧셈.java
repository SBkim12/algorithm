
public class ¾à¼öÀÇ_°¹¼ö¿Í_µ¡¼À {

	public static void main(String[] args) {
		
		int left = 1;
		int right = 3;
		
		System.out.println(solution(left, right));
		
	}
	
	public static int solution(int left, int right) {
        int answer = 0;
        
        
        for(int i=left; i<=right; i++) {
        	answer+=i;
        }
        
        int low =(int)Math.ceil(Math.sqrt((double)left));
        int high =(int)Math.ceil(Math.sqrt((double)right));
        
        for(; low<high; low++) {
        	answer-=(int)(Math.pow(low,2))*2;
        	
        }
        
        
        
        return answer;
    }

}
