import java.util.HashSet;

public class ÆùÄÏ¸ó {
   public static void main(String[] args) {
      int[] nums = { 3,3,3,2,2,2 };
      
      int N = nums.length/2;
      
      HashSet<Integer> variable = new HashSet<>();
      for(int i=0; i<nums.length; i++) {
         variable.add(nums[i]);
      }
      
      int answer = 0 ;
      if(N>variable.size()) {
         answer = variable.size();
      }else {
         answer = N;
      }
      
      System.out.println(answer);
   
   }
}