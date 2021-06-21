import java.util.Arrays;

public class 구명보트 {

	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50}	;
		int limit = 100;
		
		System.out.println(solution(people, limit));
	}
	
	public static int solution(int[] people, int limit) {
	    int answer = 0;
	    
	    //크기순 정렬을 위해 사용
	    Arrays.sort(people);

	    int min = 0;

	    for (int max = people.length - 1; min <= max; max--){
	    	//people min의 위치 값과 peolple의 max의 위치값의 합이 limit 보다 작으면  min과 max를 모두 사용하므로 max를 -1 min을 +1
	      if (people[min] + people[max] <= limit) min++;
	      //people min의 위치값과 people max의 위치값의 합이 limit보다 크면 max값만 보트에 태울수 있기때문에 max만 -1
	      
	      //한번 돌때마다 보트를 한번 씩 사용하므로 answer에 +1
	      answer++;
	    }

	    return answer;
	}
	
}
