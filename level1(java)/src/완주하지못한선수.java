
public class 완주하지못한선수 {

	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String answer = "";
        
        for(int i=0; i<participant.length; i++){
           int have =0;
           for(int j=0; j<completion.length; j++){
               if(participant[i].equals(completion[j])){
                   have++;
                   completion[j]="";
                   break;
                   
               }
               
           }
           if(have==0){
               answer=participant[i];
               break;
           }
       }
        
        System.out.println("answer : " + answer);
	}

}
