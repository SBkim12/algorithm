
public class ������� {

	public static void main(String[] args) {

		int n = 6;
		int arr1[] = {46, 33, 33 ,22, 31, 50};
		int arr2[] = {27 ,56, 19, 14, 14, 10};

		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			String a = Integer.toBinaryString(arr1[i]);
			String b = Integer.toBinaryString(arr2[i]);

			while (a.length() < n || b.length() < n) {
				if (a.length() < n) {
					a = "0" + a;
				}

				if (b.length() < n) {
					b = "0" + b;
				}
			}
			System.out.println(a);
			System.out.println(b);
			String line = "";
			for (int j = 0; j < n; j++) {
				if (a.charAt(j)=='0' && b.charAt(j)=='0') {
					line += " ";
				} else {
					line += "#";
				}
			}

			answer[i] = line;
			
			
			System.out.println(answer[i]);
		}
	}

}
