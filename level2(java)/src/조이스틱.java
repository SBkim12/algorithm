
public class 조이스틱 {

	public static void main(String[] args) {
		String name = "AAAAA";
		
		System.out.println(solution(name));
	}

	public static int solution(String name) {
        int answer = 0;
        
        //최소움직임에 들어갈수 있는 최대움직임(name.length()-1)을 대입
        int min_move = name.length()-1;
        // A = 65
        // Z = 90
        for(int i=0; i<name.length(); i++) {
        	int ASC = name.charAt(i);
        	answer += ASC-65 < 91-ASC ? ASC-65 : 91-ASC;
        	
        	//다음 값이 A일 경우 최소 움직임 계산
        	int next = i+1;
        	while(next<name.length() && name.charAt(next)=='A') {
        		next++;
        	}
        	//i+i+name.length()-next => A가 나오기 전만큼 갔다가 처음으로 돌아가서 A의 연속된 끝부분 까지의 움직임
        	min_move = Math.min(min_move, i+i+(name.length()-next));
        	
        }
        
        return answer+min_move;
    }
	
}
