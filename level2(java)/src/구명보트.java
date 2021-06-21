import java.util.Arrays;

public class ����Ʈ {

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50}	;
		int limit = 100;
		
		System.out.println(solution(people, limit));
	}
	
	public static int solution(int[] people, int limit) {
	    int answer = 0;
	    
	    //ũ��� ������ ���� ���
	    Arrays.sort(people);

	    int min = 0;

	    for (int max = people.length - 1; min <= max; max--){
	    	//people min�� ��ġ ���� peolple�� max�� ��ġ���� ���� limit ���� ������  min�� max�� ��� ����ϹǷ� max�� -1 min�� +1
	      if (people[min] + people[max] <= limit) min++;
	      //people min�� ��ġ���� people max�� ��ġ���� ���� limit���� ũ�� max���� ��Ʈ�� �¿�� �ֱ⶧���� max�� -1
	      
	      //�ѹ� �������� ��Ʈ�� �ѹ� �� ����ϹǷ� answer�� +1
	      answer++;
	    }

	    return answer;
	}
	
}
