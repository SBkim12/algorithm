
public class Äİ¶óÃ÷ÃßÃø {

	public static void main(String[] args) {

		int num = 16;
		
		int answer = colatz(num,0);
		
		System.out.println(answer);
	}
	
	public static int colatz(int num, int count) {
		
		if(num == 1) {
			return count;
		}else if(count==500) {
			return -1;
		}else if(num%2==0) {
			num/=2;
		}else if(num%2==1) {
			num=num*3+1;
		}
		count++;
		return colatz(num, count);
	}

}
