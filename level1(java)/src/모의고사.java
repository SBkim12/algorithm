import java.util.ArrayList;
import java.util.List;

public class ���ǰ��� {

	public static void main(String[] args) {
		
		int[] answers = {1,3,2,4,2};
		
		int[] stu1 = {1,2,3,4,5};
		int[] stu2 = {2,1,2,3,2,4,2,5};
		int[] stu3 = {3,3,1,1,2,2,4,4,5,5};
		
		int sco1 = 0;
		int sco2 = 0;
		int sco3 = 0;
		
		for(int i=0; i<answers.length; i++) {
			if(answers[i]==stu1[i%5]){
				sco1++;
			}
			if(answers[i]==stu2[i%8]){
				sco2++;
			}
			if(answers[i]==stu3[i%10]){
				sco3++;
			}
		}
		
		int max = sco1;
		
		if(sco2>max) {
			max = sco2;
		}
		
		if(sco3>max) {
			max = sco3;
		}
		
		List<Integer> lst = new ArrayList<>();
		
		if(max==sco1) {
			lst.add(1);
		}
		if(max==sco2) {
			lst.add(2);
		}
		if(max==sco3) {
			lst.add(3);
		}
		
		int[] answer = new int[lst.size()];
		
		for(int i=0; i<answer.length; i++) {
			answer[i]=lst.get(i);
			System.out.println(lst.get(i));
		}
		
	}

}
