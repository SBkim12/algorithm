public class 큰수_만들기 {

	public static void main(String[] args) {
		String a = "99999999999";
		int k = 3;
		
		System.out.println(solution(a,k));

	}
	//인터넷 풀이 참조( 이해가 좀 안감 ) 내가 푼것과 반대로 풂
	public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        char max;
        for(int i = 0; i < number.length() - k; i++) {
            max = '0';

            for(int j = idx; j <= k + i; j++) {
                    if(max < number.charAt(j)) {
                        max = number.charAt(j);  // 최댓값 찾기
                        idx = j + 1;
                    }
                    if (max=='9') {
                        break;
                    }
            }
            answer.append(max);
        }
        return answer.toString();
    }
//	풀이는 맞지만 런타임 에러(효율성이 떨어짐)	
//	public static String solution(String number, int k) {
//        String answer = "";
//        
//        StringBuffer sb = new StringBuffer(number);
//        for(int i=0; i<k; i++) {
//        	boolean cut = false;
//        	for(int j=0; j<sb.length()-1; j++) {
//        		if(sb.charAt(j)<sb.charAt(j+1)) {
//        			sb.deleteCharAt(j);
//        			cut=true;
//        			break;
//        		}
//        	}
//        	if(cut==false) {
//        		sb.deleteCharAt(sb.length()-1);
//        	}
//        }
//        
//        answer = sb.toString();
//        
//        return answer;
//    }

}
