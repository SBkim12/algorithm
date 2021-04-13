public class N개의_최소공배수 {

   public static void main(String[] args) {
      int[] arr = { 2, 6, 8, 14 };
      
      System.out.println(solution(arr));
   }

   public static int solution(int[] arr) {
      int lcm = arr[0];
      for(int i= 1; i<arr.length; i++) {
         int gcd =1;
         int a = 0;
         int b =0;
         if(lcm>arr[i]) {
            a=arr[i];
            b=lcm;
         }else {
            a=lcm;
            b=arr[i];
         }
         int j=2;
         while(j<=a){
            if(a%j==0&&b%j==0) {
               a/=j;
               b/=j;
               gcd*=j;
            }else {
               j++;
            }
         }
         lcm = lcm*arr[i]/gcd;
      }
         
      return lcm;
   }
}