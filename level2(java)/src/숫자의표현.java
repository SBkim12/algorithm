
public class 숫자의표현 {

	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        for(int i=1; i<=n; i++){
	            int hap = 0;
	            for(int j=i; j<=n; j++){
	                hap += j;
	                if(hap==n){
	                    answer++;
	                }else if(hap>n){
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
	}

}
