public class Ã¼À°º¹ {
   public static void main(String[] args) {
      int n = 5 ;
      int[] lost = {2, 4};
      int[] reserve = {3};
      
      int[] all = new int[n];
      int answer = 0;
      for(int i=0; i<lost.length; i++) {
         all[lost[i]-1]--;
      }
      
      for(int i=0; i<reserve.length; i++) {
         all[reserve[i]-1]++;
      }
      for(int i=0; i<n; i++) {
         System.out.println(all[i]);
         if(all[i]<0) {
            if(i>0 && all[i-1]>0) {
               all[i]++;
               all[i-1]--;
            }else if(i<n-1 && all[i+1]>0) {
               all[i]++;
               all[i+1]--;
            }
         }
         if(all[i]>=0) {
            answer++;
         }
      }
      
      System.out.println(answer);
      
   }
}