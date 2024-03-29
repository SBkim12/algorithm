
public class 키패드누르기 {

	public static void main(String[] args) {
		String answer = "";
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		
		if(hand.equals("right")) {
			hand="R";
		}else {
			hand="L";
		}
		System.out.println(hand);
		
		int nowR = 10;
        int nowL = 12;
       
        for(int i : numbers){
        	if(i==0) {
        		i=11;
        	}
        		
            if(i==1 || i==4 || i==7) {
            	answer +="L";
            	nowL = i;
            }else if(i==3 || i==6 || i==9) {
            	answer +="R";
            	nowR = i;
            }else {
            	int dl = getDistance(nowL, i);
            	int dr = getDistance(nowR, i);
            	
            	if(dl>dr) {
            		answer+="R";
            		nowR=i;
            	}else if(dl<dr) {
            		answer+="L";
            		nowL=i;
            	}else {
            		answer+=hand;
            		if(hand=="R") {
            			nowR=i;
            		}else {
            			nowL=i;
            		}
            	}
            	
            }
        }
        System.out.println(answer);
        
        
	}
	
	public static int getDistance(int hand, int target) {
		int handX = (int)Math.ceil((double)hand/3);
		int handY = hand%3;
		if(handY==0) {
			handY=3;
		}
		
		int targetX = (int)Math.ceil((double)target/3);
		int targetY = target%3;
		if(targetY==0) {
			targetY=3;
		}
		return Math.abs( handX - targetX )+Math.abs(handY - targetY);
	}

}
