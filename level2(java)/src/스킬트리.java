import java.util.ArrayList;
import java.util.List;

public class 스킬트리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill ="CBD";
		String[] skill_trees = {"C", "D", "CB", "BDA"};
		System.out.println(solution(skill, skill_trees));
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		
		
		for (int i = 0; i < skill_trees.length; i++) {
			List<Integer> index = new ArrayList<>();
			for(int j=0; j<skill_trees[i].length(); j++) {
				for(int e =0; e<skill.length(); e++) {
					if(skill_trees[i].charAt(j)==skill.charAt(e)) {
						index.add(e);
						break;
					}
				}
			}
			
			boolean possible = true;
			for(int j=0; j<index.size()-1; j++) {
				if(index.get(j)==index.get(j+1)-1) {
					possible = true;
				}else {
					possible = false;
					break;
				}
			}
			if(index.size()>0) {
				if(index.get(0)!=0) {
					possible = false;
				}
			}
			
			
			if(possible == true) {
				System.out.println(index);
				answer++;
			}
			
		}

		return answer;
	}
}
