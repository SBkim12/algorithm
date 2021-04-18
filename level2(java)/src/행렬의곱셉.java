
public class Çà·ÄÀÇ°ö¼Á {

	public static void main(String[] args) {
		int[][] arr1 = {{1,2,3}, {4,5,6}};
		int[][] arr2 = {{1,4}, {2,5}, {3,6}};
		
		int[][] answer = solution(arr1,arr2);
		for(int[] i : answer) {
			for(int j : i) {
				System.out.println(j);
			}
		}
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                for(int e=0; e<arr2.length; e++){
                    answer[i][j]+=arr1[i][e]*arr2[e][j];
                }
            }
        }
        
        return answer;        
    }
	
}
