
public class calendar {

	public static void main(String[] args) {
		
		int a = 5;
		int b= 24;
		 a = a-1;
	        while(a>0){
	            if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12){
	                b+=31;
	            }else if(a==2){
	                b+=29;
	            }else{
	                b+=30;
	            }
	            a--;
	        }
	        
	        String answer = "";
	        
	        if(b%7==1){
	            answer = "FRI";
	        }else if(b%7==2){
	            answer = "SAT";
	        }else if(b%7==3){
	            answer = "SUN";
	        }else if(b%7==4){
	            answer = "MON";
	        }else if(b%7==5){
	            answer = "TUE";
	        }else if(b%7==6){
	            answer = "WED";
	        }else if(b%7==0){
	            answer = "THU";
	        }
	        System.out.println(answer);
	}

}
