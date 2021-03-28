public class 실패율 {

	public static void main(String[] args) {
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int N = 5;

		int[] answer = new int[N];
		double[] failureRates = new double[N];
		for (int i = 1; i <= N; i++) {
            int stage = i;
            double failPerson = 0; // 도달만 한자
            double passPerson = 0; // 넘어간 자
            for (int j = 0; j < stages.length; j++) {
                if (stage <= stages[j]) {              
                    passPerson++;
                }
                if (stage == stages[j]) {            
                }
            }
            if(failPerson == 0) {                       
                failureRates[i -1] = 0; 
                continue;
            }
            failureRates[i - 1] = failPerson / passPerson; 
        }

		for (int i = 0; i < failureRates.length; i++) {
            double max = -1;                             
            int maxIdx = 0;
            for (int j = 0; j < failureRates.length; j++) {
                if (max < failureRates[j]) {              
                    max = failureRates[j];
                    maxIdx = j;
                }
            }
            failureRates[maxIdx] = -1;                      
            answer[i] = maxIdx+1;
            System.out.println(answer[i]);
        }

	}

}
