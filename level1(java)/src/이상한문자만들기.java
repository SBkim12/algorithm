
public class 이상한문자만들기 {

   public static void main(String[] args) {
      String s = "try hello world";

      String[] index = s.split("");
      String answer = "";
      int space = 0;
      for (int i = 0; i < index.length; i++) {
         
         if (space % 2 == 0) {
            answer += index[i].toUpperCase();
         } else {
            answer += index[i].toLowerCase();
         }
         space++;
         if (index[i].equals(" ")) {
            space = 0;
         }
      }

      System.out.println(answer);
   }

}