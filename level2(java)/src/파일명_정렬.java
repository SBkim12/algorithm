import java.util.Arrays;
import java.util.Comparator;

public class ���ϸ�_���� {

	public static void main(String[] args) {
		String[] files = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		
		files = solution(files);
		
		for(String s : files) {
			System.out.println(s);
		}
	}
	
	public static String[] solution(String[] files) {
		
		//���� ��� ����
		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				String[] file1 = detach(a);
				String[] file2 = detach(b);
				
				//���� head�κ����� �� ����
				int headValue = file1[0].compareTo(file2[0]);
				
				//���� head�κ��� ���� ��� number�κ����� �� ����
				if(headValue==0) {
					int file_num1 = Integer.parseInt(file1[1]);
					int file_num2 = Integer.parseInt(file2[1]);
					
					return file_num1-file_num2;
				}else {
					return headValue;
				}
			}
			
			
			//���� �̸� ����
			private String[] detach(String str) {
				String head = "";
				String number = "";
				String tail = "";
				
				int idx = 0;
				for(; idx<str.length(); idx++) {
					char ch = str.charAt(idx);
					if(ch >= '0' && ch <= '9') break;
					head += ch;
				}
				
				for(; idx<str.length(); idx++) {
					char ch = str.charAt(idx);
					if(!(ch >= '0' && ch <= '9')) break;
					number += ch;
				}
				
				for(; idx<str.length(); idx++) {
					char ch = str.charAt(idx);
					tail+=ch;
				}
				String[] file = {head.toUpperCase(), number, tail};
				
				return file;
			}
		});
		
		return files;
	}
}
			
