
public class ���̽�ƽ {

	public static void main(String[] args) {
		String name = "AAAAA";
		
		System.out.println(solution(name));
	}

	public static int solution(String name) {
        int answer = 0;
        
        //�ּҿ����ӿ� ���� �ִ� �ִ������(name.length()-1)�� ����
        int min_move = name.length()-1;
        // A = 65
        // Z = 90
        for(int i=0; i<name.length(); i++) {
        	int ASC = name.charAt(i);
        	answer += ASC-65 < 91-ASC ? ASC-65 : 91-ASC;
        	
        	//���� ���� A�� ��� �ּ� ������ ���
        	int next = i+1;
        	while(next<name.length() && name.charAt(next)=='A') {
        		next++;
        	}
        	//i+i+name.length()-next => A�� ������ ����ŭ ���ٰ� ó������ ���ư��� A�� ���ӵ� ���κ� ������ ������
        	min_move = Math.min(min_move, i+i+(name.length()-next));
        	
        }
        
        return answer+min_move;
    }
	
}
