
public class �����������Ǻ� {

	public static void main(String[] args) {
		long n = 121;
		long answer = 0;
		double doubleSqrt = Math.sqrt(n);
		//Math.sqrt() => ������ ���ϴ� ����
		
		if(doubleSqrt==(int)doubleSqrt) {
			answer = (long)Math.pow(doubleSqrt+1,2);
		}else {
			answer = -1;
		}
		
		System.out.println(answer);
		
	}

}
