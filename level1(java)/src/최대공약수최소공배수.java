
public class 최대공약수최소공배수 {

	public static void main(String[] args) {
		// 유클리드의 호제법
		// 최대 공약수 = a > b 일경우 b와 a%b의 최대 공약수와 같다
		// 최소공배수 = a * b / 최대공약수
		
		int a = 2;
		int b = 5;
		
		int big; int small;
		
		if(a>b) {
			big = a;
			small = b;
		}else {
			big = b;
			small = a;
		}
		
		int answer[] = new int[2];
		
		answer [0] = Euclidean(big,small);
		answer [1] = big*small/answer[0];
		
		System.out.println(answer[0]+ "  " + answer[1]);
	}
	public static int Euclidean(int big, int small) {
		if(big%small==0) {
			return small;	
		}
		return Euclidean(small, big%small);
	}
	
}
