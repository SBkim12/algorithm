import java.util.ArrayList;
import java.util.List;

public class 기능개발 {

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		
		System.out.println(solution(progresses, speeds));
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
        
        
        int now = 0;
        List<Integer> lst = new ArrayList<>();
        while(now<progresses.length) {
        	int complete = 0;
        	for(int i=now; i<progresses.length; i++) {
        		if(progresses[i]<100) {
        			progresses[i]+=speeds[i];
        		}
        	}
        	for(int i=now; i<progresses.length; i++) {
        		if(progresses[i]>=100) {
        			now++;
        			complete++;
        		}else {
        			break;
        		}
        	}
        	if(complete>0) {
        		lst.add(complete);
        	}
        }
        
        int[] answer = new int[lst.size()];
        for(int i=0; i<lst.size(); i++) {
        	answer[i]=lst.get(i);
        }
        
        
        return answer;
    }

}
