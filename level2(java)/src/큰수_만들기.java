public class ū��_����� {

	public static void main(String[] args) {
		String a = "99999999999";
		int k = 3;
		
		System.out.println(solution(a,k));

	}
	//���ͳ� Ǯ�� ����( ���ذ� �� �Ȱ� ) ���� Ǭ�Ͱ� �ݴ�� ǯ
	public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        char max;
        for(int i = 0; i < number.length() - k; i++) {
            max = '0';

            for(int j = idx; j <= k + i; j++) {
                    if(max < number.charAt(j)) {
                        max = number.charAt(j);  // �ִ� ã��
                        idx = j + 1;
                    }
                    if (max=='9') {
                        break;
                    }
            }
            answer.append(max);
        }
        return answer.toString();
    }
//	Ǯ�̴� ������ ��Ÿ�� ����(ȿ������ ������)	
//	public static String solution(String number, int k) {
//        String answer = "";
//        
//        StringBuffer sb = new StringBuffer(number);
//        for(int i=0; i<k; i++) {
//        	boolean cut = false;
//        	for(int j=0; j<sb.length()-1; j++) {
//        		if(sb.charAt(j)<sb.charAt(j+1)) {
//        			sb.deleteCharAt(j);
//        			cut=true;
//        			break;
//        		}
//        	}
//        	if(cut==false) {
//        		sb.deleteCharAt(sb.length()-1);
//        	}
//        }
//        
//        answer = sb.toString();
//        
//        return answer;
//    }

}
