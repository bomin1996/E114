package algorithmEx.date0302;

public class Ex01_smc {
	
	//url 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120883

	    public String solution(String[] id_pw, String[][] db) {
	        String answer = "fail"; //하단 조건 만족하지 않으면 fail
	             
	        // db길이만큼 for 반복하면서 
	        for(int i=0; i<db.length; i++){ 
	        // id_pw[0]일치하는 요소 찾아보기
	            if(id_pw[0].equals(db[i][0]))
	            {
	                //일치하면 id_pw[1] 과 db.[i][1] 일치하는지 확인
	               if(id_pw[1].equals(db[i][1]))
	               {
	                   // 둘다 일치하면 로그인
	                   return new String("login"); 
	               } 
	                // 비번 비교 틀리면 틀림 비번
	                return new String("wrong pw");  
	            }            
	        }
	        return answer;
	    }
}
