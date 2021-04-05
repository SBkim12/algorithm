import java.util.ArrayList;
import java.util.List;

public class 문자열압축 {

   public static void main(String[] args) {

      String s = "b";
      System.out.println(solution(s));

   }

   public static int solution(String s) {
      int answer = 0;
      int min = 1000;
      for (int i = 1; i <=s.length()/2; i++) {
         
         
         String complete = "";
         
         List<String> ss = new ArrayList<>();
         System.out.println(i + "자리 쪼개기");
         
         for (int j = 0; j < (int)Math.ceil(s.length() / (double)i); j++) {
            int end = (j + 1) * i;
            if(end>s.length()) {
               end=s.length();
            }
            ss.add(s.substring(j * i, end));
            System.out.println(s.substring(j * i, end));
         }
         
         String comp = ss.get(0);
         int same = 1;
         for (int j = 1; j < ss.size(); j++) {
            if (comp.equals(ss.get(j))) {
               same++;
               
            } else {
               if (same > 1) {
                  complete += same;
               }
               complete += comp;
               comp = ss.get(j);
               same = 1;
            }
            
            if (j == ss.size() - 1) {
               if (same > 1) {
                  complete += same;
               }
               complete += comp;
            }
         }

         System.out.println(complete);
         System.out.println(complete.length());
         if (min > complete.length()) {
            min = complete.length();
         }

      }
      
      if(s.length()<=1) {
         min=s.length();
      }

      answer = min;

      return answer;
   }
}