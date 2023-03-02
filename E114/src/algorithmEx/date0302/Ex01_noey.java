package algorithmEx.date0302;

public class Ex01_noey {

	//url 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120883
     public String solution(String[] id_pw, String[][] db) {
    	 String answer = "";
         
	        for(int i = 0; i < db.length; i++) {
	        	if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
	        		answer = "login";
	        		break;
	        	}else if(id_pw[0].equals(db[i][0]) && id_pw[1] != db[i][1]){
	        		answer = "wrong pw";
                 break;
	        	}else answer = "fail";
	        }
	        return answer;
	    }
	

}
