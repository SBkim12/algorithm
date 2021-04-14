import java.util.ArrayList;
import java.util.List;

public class 순위_검색 {

   public static void main(String[] args) {
      String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
            "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
            "python backend senior chicken 50" };
      String[] query = { "java and backend and junior and pizza 100",
            "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
            "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };

      int[] abc = solution(info, query);

      for (int i = 0; i < abc.length; i++) {
         System.out.println(abc[i]);
      }
   }   

   
   // 답은 맞으나 효율성 탈락 다른 방식의 시도 필요
   public static int[] solution(String[] info, String[] query) {
      int[] answer = new int[query.length];
      
      List<String[]> lst = new ArrayList<>();
      for(int j=0; j<info.length; j++) {
         String[] infoes = info[j].split(" ");
         lst.add(infoes);
      }
         
      for (int i = 0; i < query.length; i++) {
         query[i] = query[i].replaceAll("and ", "");
         String[] querys = query[i].split(" ");
         
         for(int j=0; j<lst.size(); j++) {
            String[] infoes = lst.get(j);
            answer[i]+=pass(infoes,querys);
         }
         
      }

      return answer;
   }

   public static int pass(String[] info, String[] query) {

      boolean pass = false;
      for (int i = 0; i < query.length; i++) {
         if(query[i].equals("-")) {
            pass = true;
            continue;
         }
         if (i == query.length - 1) {
            if(Integer.parseInt(info[i])>=Integer.parseInt(query[i])) {
               pass=true;
            }else {
//               System.out.println(info[i] + " " + query[i]);
               pass=false;
               return 0;
            }
         } else {
            if(info[i].equals(query[i])) {
               pass=true;
            }else {
//               System.out.println(info[i] + " " + query[i]);
               pass=false;
               return 0;
            }
         }
      }
      if(pass==true) {
         return 1;
      }
      return 0;
   }
   
   
   

}