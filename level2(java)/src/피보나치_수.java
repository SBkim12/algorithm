import java.util.ArrayList;
import java.util.List;

public class 피보나치_수 {

   public static void main(String[] args) {
      System.out.println(solution(1000));
   }
   public static int solution(int n) {
        List<Integer> ans = new ArrayList<>();
        
        ans.add(0);
        ans.add(1);
        
        for(int i=2; i<=n; i++) {
           ans.add((ans.get(i-1)+ans.get(i-2))%1234567);
        }
        
        
        return ans.get(n);
    }
   
   //재귀함수 시간 초과
   /*
    * public static int fibonachi(int no) {
    * 
    * 
    * if(no==0) { return 0; }else if(no==1) { return 1; }
    * 
    * return (fibonachi(no-1)+fibonachi(no-2))%1234567; }
    */
}