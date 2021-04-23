
public class 점프와순간이동 {
	
	public static void main(String[] args) {
		int a =6;
		
		System.out.println(solution2(a));
	}
	
	//나누어서 풀기
	public static int solution2(int n) {
        int ans = 0;

        while(n>=1){
            if(n%2==0){
                n/=2;
            }else{
                n-=1;
                ans++;
            }
        }

        return ans;
    }
	
	//이진수로 푸는 방법
	public int solution(int n) {
        int ans = 0;

        String str = Integer.toBinaryString(n);
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='1'){
                ans++;
            }
        }

        return ans;
    }

}
