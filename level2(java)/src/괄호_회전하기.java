
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ��ȣ_ȸ���ϱ� {
   public static void main(String[] args) {
      String s =    "}]()[{";
      
      System.out.println(solution(s));
   }
   
   //���α׷��ӽ� �̺�Ʈ �ڵ����� Ǭ ��Ŀ� ������ �־ ��Ǯ��
   public static int solution(String s) {
      
      int answer =0;
      
      
      List<String> lst = new ArrayList<>();   
      String[] Ss = s.split("");
      for(int i=0; i<Ss.length; i++) {
         lst.add(Ss[i]);
      }
      
      for(int i=0; i<lst.size(); i++) {
         lst.add(lst.get(0));
         lst.remove(0);
         if(isRight(lst)) {
            answer++;
         }
      }
      
      
      
      return answer;
   }
   
   public static boolean isRight(List<String> lst) {
      Stack<String> stack = new Stack<>();
      
      for(int i=0; i<lst.size(); i++) {
         
         if(stack.empty()) {
            stack.push(lst.get(i));
            //System.out.println(stack.peek());
         }else {
            String a = stack.peek();
            String b = lst.get(i);
            //System.out.println(a + " " + b);
            if((a.equals("(") && b.equals(")")) || (a.equals("{") && b.equals("}")) || (a.equals("[") && b.equals("]"))) {
               stack.pop();
            }else {
               stack.push(b);
            }
         }
      }
      
      if(stack.empty()) {
         return true;
      }else {
         return false;
      }
   }
}