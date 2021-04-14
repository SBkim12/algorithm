public class JadenCase_문자열_만들기 {

   public static void main(String[] args) {

      String s = " adgagd 3eagdag ";

      System.out.println(solution(s));

   }

   public static String solution(String s) {
      String answer = "";

      s = s.toLowerCase();

      String[] cha = s.split("");
      boolean blank = true;
      for (int i = 0; i < cha.length; i++) {
         
         if(cha[i].equals(" ")) {
            answer+=" ";
            blank=true;
         }else {
            if(blank==true) {
               answer+=cha[i].toUpperCase();
               blank=false;
            }else {
               answer+=cha[i];
            }
         }
      }

      return answer;
   }
}