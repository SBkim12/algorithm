public class 예상_대진표 {

   public static void main(String[] args) {
      int n = 8;
      int a = 4;
      int b = 7;
      
      System.out.println(solution(n,a,b));
   }
   
   public static int solution(int n, int a, int b)
    {
        int answer = 0;
        
        if(a%2!=0) {
           a++;
        }
        if(b%2!=0) {
           b++;
        }
        
        double c = 2;
        while(true) {
           if((int)Math.ceil(a/c)==(int)Math.ceil(b/c)) {
              answer++;
              break;
           }else {
              c*=2;
              answer++;
           }
        }
        return answer;
    }

}