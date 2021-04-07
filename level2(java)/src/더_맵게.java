import java.util.PriorityQueue;

public class ��_�ʰ� {

   public static void main(String[] args) {
      int[] a = { 1, 2, 3, 9, 10, 12 };
      int b = 7;

      System.out.println(solution(a, b));
   }
   
   //�켱���� ť�� ����Ͽ� �Է��ϸ鼭 �켱������ �°� ��(�Ʒ��Ͱ� �ٸ��� ���� �񱳸� ���� ����)
   public static int solution(int[] scoville, int K) {
         int answer = 0;

         PriorityQueue<Integer> heap = new PriorityQueue<>();
         for(int i=0; i<scoville.length; i++){
             heap.offer(scoville[i]);
         }

         while(heap.peek() < K){
             // �������� �ִµ� ��ĥ�� �ִ� ���� ���� ��� -1 ��ȯ
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
   
   // ���� ������ ��Ÿ��, ȿ���� �׽�Ʈ Ż��
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