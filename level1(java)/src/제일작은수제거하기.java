import java.util.Arrays;

public class ���������������ϱ� {

	public int[] solution(int[] arr) {
		if (arr.length <= 1)
			return new int[] { -1 };
		int min = Arrays.stream(arr).min().getAsInt();
		//��Ʈ���� �����۵��� ��� ���Ͽ� �ּҰ� 1���� ������ �� ����
		return Arrays.stream(arr).filter(i -> i != min).toArray();
		//��ҵ��� min�� �ƴѰ��鸸 �ɷ� �ش� 
	}

}
