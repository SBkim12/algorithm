
public class ������ȯ�ݺ��ϱ� {

	public static void main(String[] args) {
		
		String s = "110010101001";
		
		solution(s);
	}
	
	public static int[] solution(String s) {
        
        int zero = 0;
        int no = 0;
        while(!s.equals("1")) {
        	
        	//s�� 0�� ������ ���ؼ� ��ȯ �� ������ ���ϱ�
        	zero += s.length() - s.replace("0", "").length();
        	
        	//0 �����
        	s = s.replace("0", "");
        	
        	//s�� ���̷� 2���� �����
        	s=Integer.toBinaryString(s.length());
        	
        	//2����ȯ Ƚ�� +1
        	no++;
        }
        
        int[] answer = {no, zero};
        
        System.out.println(zero);
        System.out.println(no);
        
        return answer;
    }

}
