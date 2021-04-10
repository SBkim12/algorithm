import java.util.Arrays;

public class ¶¥µû¸Ô±â {

	public static void main(String[] args) {

		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };

		System.out.println(solution(land));
	}

	private static int solution(int[][] land) {
		int answer = 0;

		int[] hap = new int[land[0].length];
		
		if(land.length <1) {
			for(int i=0; i<land[i].length; i++) {
				hap[i]=land[0][i];
			}
		}else {
			for (int i = 1; i < land.length; i++) {
				if (i == 1) {
					for (int j = 0; j < land[i].length; j++) {
						hap[j] = land[i][j];
					}
					
					hap = haps(land[i-1], hap);
				}else {
					
					hap = haps(hap, land[i]);
				}
			}
		}
		
		

		for (int i = 0; i < hap.length; i++) {
			if (hap[i] > answer) {
				answer = hap[i];
			}
		}

		return answer;
	}
	
	static int[] haps(int[] a, int[] b){
		int idx = 0;
		int max = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
				idx = i;
			}
		}
		
		Arrays.sort(a);
		int max2 = a[a.length-2];
		
		for (int j = 0; j < a.length; j++) {
			if (j == idx) {
				b[j] += max2;
			} else {
				b[j] += max;
			}
			System.out.println(j + "¹øÂ° : " + b[j]);
		}
		
		return b;
	}
}
