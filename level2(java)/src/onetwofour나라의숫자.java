
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class onetwofour나라의숫자 {
   public static void main(String[] args) {

      int n = 5;

      System.out.println(solution(n));
   }

   public static String solution(int n) {
      String answer = "";
      int mok = n;
      int nmg;
      List<Integer> lst = new ArrayList<>();
      while (mok != 0) {
         nmg = mok % 3;
         mok = mok / 3;

         if (nmg == 0) {
            mok--;
            nmg = 4;
         }
         if(nmg==3) {
            nmg = 4;
         }
         lst.add(nmg);
      }

      ListIterator li = lst.listIterator(lst.size());

      while (li.hasPrevious()) {
         answer+=li.previous();
      }

      return answer;
   }
}