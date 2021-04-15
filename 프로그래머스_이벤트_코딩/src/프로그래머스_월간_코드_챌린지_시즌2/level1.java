package 프로그래머스_월간_코드_챌린지_시즌2;

public class level1 {
	class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        for(int i=0; i<absolutes.length; i++){
	            if(signs[i]==true){
	                answer+=absolutes[i];
	            }else{
	                answer-=absolutes[i];
	            }
	        }
	        
	        return answer;
	    }
	}
}
