
public class 멀쩡한사각형 {
	
	//풀이방식을 몰라서 인터넷 참조
	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		
		System.out.println(solution(w,h));
	}
	
	public static long solution(int w, int h) {
        long answer = 1;
        
        long gcd = 1;
        long small = w < h ? w : h;
        
        int W = w;
        int H = h;
        int now = 2;
        while(now<=small){
            if(W%now==0 && H%now==0){
                gcd*=now;
                W/=now;
                H/=now;
            }else{
                now++;
            }
        }
        System.out.println(gcd);
        answer = (long)w*h - (W+H-1)*gcd;
        
        return answer;
    }

}
