public class 다음_큰_숫자 {

   public static void main(String[] args) {
      
      int no = 78;
      
      System.out.println(solution(no));
      
   }
   
   public static int solution(int n) {
        int answer = 0;


        String binaryString = Integer.toBinaryString(n); 
        int have = 0;
        for(int i=0; i<binaryString.length(); i++) {
           if(binaryString.charAt(i)=='1') {
              have++;
           }
        }
        
        while(true) {
           int count =0;
           n++;
           String binaryString2 = Integer.toBinaryString(n);
           for(int i=0; i<binaryString2.length(); i++) {
              if(binaryString2.charAt(i)=='1') {
                 count++;
              }
              if(count>have) {
                 break;
              }
           }
           
           if(have==count) {
              answer = Integer.parseInt(binaryString2,2);
              break;
           }
        }
           
        
        return answer;
    }

}