import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		
		int[] citations = {2,2,2,2,2,2};
		
		System.out.println(solution(citations));
		
	}
	
	//���� ���� ���ذ� �� �Ȱ�
	public static int solution(int[] citations) {
        
        Arrays.sort(citations);
        
        int answer = 0;
        for(int i=citations.length-1; i>=0; i--) {
        	if(citations[i]<=answer) {	
        		break;
        	}else {
        		answer++;
        	}
        }

        
        return answer;
    }
	
}
