import java.util.ArrayList;
import java.util.List;

public class 다트게임 {

   public static void main(String[] args) {
      String dartResult = "1D#2S*3S";
      
      int now = 0;
      int no = 0;
      List<Integer> lst = new ArrayList<>();
      for(int i=0; i<dartResult.length(); i++) {
         if(48 <= dartResult.charAt(i) && dartResult.charAt(i) <= 57) { 
            if(dartResult.charAt(i)=='1') {
               if(dartResult.charAt(i+1)=='0') {
                  now = 10;
               }else {
                  now = 1;
               }
            }else if(dartResult.charAt(i)=='0'){
               if(i>0) {
                  if(dartResult.charAt(i-1)=='1') {
                     continue;
                  }else {
                     now= 0;
                  }
               }
               continue;
            }else {
               String a =  String.valueOf(dartResult.charAt(i));
               now = Integer.parseInt(a);
            }
         }else if(dartResult.charAt(i)=='S') {
            now=(int)Math.pow(now, 1);
            lst.add(now);
            no++;
         }else if(dartResult.charAt(i)=='D') {
            now=(int)Math.pow(now, 2);
            lst.add(now);
            no++;
         }else if(dartResult.charAt(i)=='T') {
            now=(int)Math.pow(now, 3);
            lst.add(now);
            no++;
         }else if(dartResult.charAt(i)=='*') {
            if(no<2) {
               lst.set(no-1, lst.get(no-1)*2);
            }else {
               lst.set(no-1, lst.get(no-1)*2);
               lst.set(no-2, lst.get(no-2)*2);
            }
         }else if(dartResult.charAt(i)=='#') {
            lst.set(no-1, lst.get(no-1)*-1);
         }
      }
      int answer = 0;
      for(int i=0; i<lst.size(); i++) {
         answer += lst.get(i);
         System.out.println(lst.get(i));
      }
      
      System.out.println(answer);
      
      
      
   }

}