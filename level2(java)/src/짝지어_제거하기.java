import java.util.Stack;

public class 짝지어_제거하기 {

	public static void main(String[] args) {
		String str = "baabaa";
		
		System.out.println(solution(str));
	}
	
	public static int solution(String s)
    {
        
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
        	if(stack.isEmpty()) {
        		stack.push(String.valueOf(s.charAt(i)));
        	}else {
        		String have = stack.peek();
        		String now = String.valueOf(s.charAt(i));
        		if(!have.equals(now)) {
        			stack.push(now);
        		}else {
        			stack.pop();
        		}
        	}
        }
        

        return stack.size()==0?1:0;	
        
    }
}
