import java.util.ArrayList;
import java.util.Collections;

public class ���ڿ�������������� {
	//���� ���ظ� �߸��� �����ɸ� �̤�
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		String[] answer = new String[strings.length];
		
		ArrayList<String> array = new ArrayList<String>();
        
        for (int i=0; i<strings.length; i++) {
            array.add(strings[i].charAt(n) + strings[i]);
        }
		
        Collections.sort(array);
        
        for(int i=0; i<array.size(); i++) {
        	answer[i]=array.get(i).substring(1);
        }
        
        System.out.println(answer[0]+ answer[1]+ answer[2]);
	}
	
	


}
