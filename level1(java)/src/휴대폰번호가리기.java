
public class 휴대폰번호가리기 {

	public static void main(String[] args) {
		
		String phone_number = "01012345678";
		
		String visible = "";
        
        visible = phone_number.substring(phone_number.length()-4,phone_number.length());
        
        String invisible = "";
        
        for(int i=0; i<phone_number.length()-4; i++) {
        	invisible += "*";
        }
        
        String answer = invisible + visible;
        
        System.out.println(answer);
        
	}

}
