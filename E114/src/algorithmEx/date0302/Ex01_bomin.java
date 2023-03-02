package algorithmEx.date0302;

public class Ex01_bomin {

	//url 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120883
	//id_pw를 입력 받은 값을  db에 있는 데이터를 비교 하여 answer을 반환하는 문제 
	
	public String solution(String[] id_pw, String[][] db) {
        String login = "fail";//아래 조건에 들어가지 않으면 fail반환
        
        for(int i = 0; i<db.length;i++){
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])){
                login = "login";//id 와 비밀번호과 동일하면 로그인 반환
                return login;
            }else if(id_pw[0].equals(db[i][0]) && id_pw[1] != db[i][1]){
                login = "wrong pw"; //id만 같다면 비밀번호만 틀리다고 반환
            }
        }
        return login;
    }

}
