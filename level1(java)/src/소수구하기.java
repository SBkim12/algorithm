
public class �Ҽ����ϱ� {

	public static void main(String[] args) {
		// �����佺�׽��� ü
		int k=1000000;
		
		int answer = 0;
		boolean[] checked = new boolean[k + 1];
 
		for (int i = 2; i <= k; i++) {
			if (!checked[i])
				answer++;
			for (int j = i; j <=k; j += i) {
				if (!checked[j])
					checked[j] = true;
			}
		}
		
		System.out.println(answer);
	}

}
