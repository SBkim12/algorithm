
public class 시저암호 {

   public static void main(String[] args) {
      String s = "a B z";
      int n = 4;

      String answer = "";

      for (int i = 0; i < s.length(); i++) {
         if (s.charAt(i) == ' ') {
            answer += " ";
         } else {
            System.out.println(s.charAt(i));
            
            int a = s.charAt(i) + n;
            System.out.println(a);
            
            if(s.charAt(i)>=97) {
               if(a>122) {
                  a-=26;
               }
            }else {
               if(a>90) {
                  a-=26;
               }
            }
            
            System.out.println(a);
            // 소문자 97 ~ 126
            // 대문자 65 ~ 90
            char b = (char) a;
            answer += String.valueOf(b);
         }
      }

      System.out.println(answer);
   }

}