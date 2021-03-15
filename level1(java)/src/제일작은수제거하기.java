import java.util.Arrays;

public class 제일작은수제거하기 {

	public int[] solution(int[] arr) {
		if (arr.length <= 1)
			return new int[] { -1 };
		int min = Arrays.stream(arr).min().getAsInt();
		//스트림의 아이템들을 모두 비교하여 최소값 1개를 리턴후 값 추출
		return Arrays.stream(arr).filter(i -> i != min).toArray();
		//요소들을 min이 아닌값들만 걸러 준다 
	}

}
