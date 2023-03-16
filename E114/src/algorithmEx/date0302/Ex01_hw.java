package algorithmEx.date0302;

public class Ex01_hw {
	
	//url 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120883
	public static void main(String[] args) {
		String[] id_pw = {"meosseugi", "1234"};		// 테스트용 값 설정
        String[][] db = {{"rardss","123"},{"yyoom","1234"},{"meosseugi","1234"}}; // 테스트용 값 설정 
        
        for(int i=0; i<db.length; i++) {		// db에 있는 값하고 id_pw의 값을 비교하는 반복문 
        	if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {			// db 값하고 id_pw의 값이 서로 동일 할 때
        		System.out.println("login");										// login 출력
        		break;																// if문 빠져나오게 함
        	}else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {		// db 값하고 id_pw의 id 값은 동일하나 pw의 값은 동일 하지 않을 경우 
        		System.out.println("wrong pw");										// wrong pw 출력
        		break;																// if문 빠져나오게 함
        	}else {															
        		System.out.println("fail");											// 위의 조건 외의 경우 fail출력
        	}
        }
   /*
        class Solution {
            public String solution(String[] id_pw, String[][] db) {
                String answer = "";
                
                for(int i=0; i<db.length; i++) {
                	if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                		answer = "login";
                        break;
                	}else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
                		answer = "wrong pw";
                        break;
                	}else {
                		answer = "fail";
                	}
                }
                
                return answer;
            }
        }
        프로그래머스에 제출한 닶
   */
	}

}

//sadsa