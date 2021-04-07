import java.util.PriorityQueue;

public class 더_맵게 {

   public static void main(String[] args) {
      int[] a = { 1, 2, 3, 9, 10, 12 };
      int b = 7;

      System.out.println(solution(a, b));
   }
   
   //우선순위 큐를 사용하여 입력하면서 우선순위에 맞게 들어감(아래것과 다르게 많은 비교를 하지 않음)
   public static int solution(int[] scoville, int K) {
         int answer = 0;

         PriorityQueue<Integer> heap = new PriorityQueue<>();
         for(int i=0; i<scoville.length; i++){
             heap.offer(scoville[i]);
         }

         while(heap.peek() < K){
             // 작은수가 있는데 합칠수 있는 수가 없는 경우 -1 반환
            if(heap.size() < 2) {
                return -1;
             }
             int f1 = heap.poll();
             int f2 = heap.poll();

             int newFood = f1 + (f2 * 2);
             heap.offer(newFood);
             answer++;
         }

         return answer;
      }
   
   // 답은 맞으나 런타임, 효율성 테스트 탈락
//   public static int solution(int[] scoville, int K) {
//        int answer = 0;
//        
//        List<Integer> lst = new ArrayList<>();
//        for(int i=0; i<scoville.length; i++){
//            lst.add(scoville[i]);
//        }
//        
//        boolean pass = true;
//        while(pass){
//           Collections.sort(lst);
//            pass = false;
//            if(lst.get(0)<K) {
//               int small1 = lst.get(0);
//               int small2 = lst.get(1);
//               lst.set(1,small1+small2*2);
//               lst.remove(0);
//               
//               answer++;
//               pass = true;
//            }
//        }
//        
//        
//        return answer;
//    }
}