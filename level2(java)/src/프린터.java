import java.util.Stack;

public class 프린터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		
		System.out.println(solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        Stack<String> map = new Stack<>();
        for(int i=0; i<priorities.length; i++) {
        	stack.add(priorities[i]);
        	if(i==location) {
        		map.add("answer");
        	}else {
            	map.add(String.valueOf(i));	
        	}
        }
        
        while(stack.size()>0) {
        	int now = stack.elementAt(0);
        	String nows = map.elementAt(0);
//        	System.out.println(now + " : " +nows);
        	
        	boolean have = false;
        	for(int i=now+1; i<10; i++) {
        		if(stack.contains(i)==true) {
//        			System.out.println("값이 있음");
        			have = true;
        			break;
        		}
        	}
        	
        	if(have==true) {
        		stack.remove(0);
        		map.remove(0);
        		stack.add(now);
        		map.add(nows);
        	}else {
//        		System.out.println("방출 : "+now);
        		stack.remove(0);
        		map.remove(0);
        		answer++;
        		if(nows.equals("answer")){
        			break;
        		}
        	}
        }
        
        
        
        return answer;
    }

}
