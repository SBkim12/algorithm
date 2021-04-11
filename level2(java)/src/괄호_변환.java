
public class °ýÈ£_º¯È¯ {

	public static void main(String[] args) {
		String s = "()))((())";
		
		System.out.println(solution(s));
	}

	public static String solution(String p) {

		if ( p.equals("") ) return "";
		
		if ( rightString(p) ) return p;

		String answer = "";

		int right= 0;
		int left = 0;
		int index = 0 ;

		for ( char c : p.toCharArray() ) {
			index++;

			if(c=='(') left++;
			else if(c==')') right++;

			if ( right==left ) {
				break;
			}
		}

		String u = p.substring(0,index);
		String v = p.substring(index,p.length());
		
		System.out.println("u : " + u +", v : " + v );
		
		if ( rightString(u) ) {
			answer=u;
			answer+=solution(v);
		}else {
			answer+="(";
			answer+=solution(v);
			answer+=")";
			
			u = u.substring(1,u.length()-1);
			for( char c : u.toCharArray() ) {
				if(c==')') {
					answer+="(";
				}else if(c=='(')
					answer+=")";
			}
		}
		return answer;
	}

	
	public static boolean rightString(String s) {
		int now =0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') {
				now++;
			}else {
				now--;
			}
			if(now<0) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
