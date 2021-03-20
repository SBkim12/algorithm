import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 자연수뒤집어배열로만들기 {

   public static void main(String[] args) {
         long n = (long)12345;
      
           String Num = Long.toString(n);
           
           String[] Nums = Num.split("");
           
           List<Integer> lst = new ArrayList<Integer>();
           
           for(int i=0; i<Nums.length; i++) {
              lst.add(Integer.parseInt(Nums[i]));
           }
           
           Collections.reverse(lst);
           System.out.println(lst);
           int[] answer = new int[lst.size()];
           
           for(int i=0; i<lst.size(); i++) {
              answer[i]=lst.get(i);
              
           }       
   }

}