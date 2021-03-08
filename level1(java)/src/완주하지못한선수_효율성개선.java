import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수_효율성개선 {

	public String solution(String[] participant, String[] completion) {
        int val =0;
		String answer = "";
		
		Map<String, Integer> hm = new HashMap<>();
		
		for(String part : participant) {
			if(hm.get(part) == null) {
				hm.put(part,1);
			}else {
				val = hm.get(part) + 1;
				hm.put(part,val);
			}
		}
		
		for(String comp : completion) {
			val = hm.get(comp) -1;
			hm.put(comp, val);
		}
		
		for(String key : hm.keySet()) {
			if(hm.get(key)==1) {
				answer = key;
			}
		}
        return answer;
    }

}
