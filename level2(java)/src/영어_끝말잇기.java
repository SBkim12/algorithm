import java.util.Stack;

public class 영어_끝말잇기 {

	public static void main(String[] args) {
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		
		int[] a = solution(n,words);
		
		System.out.println(a[0] + "  "  + a[1]);
		
	}
	
	public static int[] solution(int n, String[] words) {
		int who = 0;
		int turn = 0;
        Stack<String> stack = new Stack<>();
        
        for(int i=0; i<words.length; i++) {
        	who++;
        	if(stack.empty()) {
        		stack.push(words[i]);
        	}else {
        		System.out.println(stack.peek() + " " + words[i]);
        		if(stack.contains(words[i])) {
        			turn = (int)Math.ceil(who/(double)n);
        			who = who%n;
        			if(who==0) {
        				who=n;
        			}
        			break;
        		}
        		char a= stack.peek().charAt(stack.peek().length()-1);
        		char b = words[i].charAt(0);
        		System.out.println(a + " " + b);
        		if(a==b) {
        			stack.push(words[i]);
        		}else {
        			turn = (int)Math.ceil(who/(double)n);
        			who = who%n;
        			if(who==0) {
        				who=n;
        			}
        			break;
        		}
        	}
        }
        if(turn==0) {
        	who=0;
        }
        int[] answer = {who, turn};
        
        return answer;
    }

}
