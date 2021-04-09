public class 가장_큰_정사각형_찾기 {

   public static void main(String[] args) {
      int[][] board = {{0}};
      
      System.out.println(solution(board));
   
   }
   
   // 다른 사람이 풀은거 참조..
   public static int solution(int[][] board) {
      int answer = 0;
      
      int row = board.length;
      int col = board[0].length;
      int[][] map = new int[row][col];
      
      for(int i=0; i<row; i++) {
         for(int j=0; j<col; j++) {
               map[i][j]=board[i][j];
         }
      }
      
      for(int i=0; i<row; i++) {
         for(int j=0; j<col; j++) {
            if(i==0 || j==0) {
               answer = Math.max(answer,map[i][j]);
               continue;
            }else if(map[i][j]!=0) {
               int a = map[i-1][j];
               int b = map[i][j-1];
               int c = map[i-1][j-1];
               map[i][j] = Math.min(Math.min(a, b), c)+1;
               answer = Math.max(answer,map[i][j]);
            }
         }
      }
      
         
         
      return answer*answer;
   }
}