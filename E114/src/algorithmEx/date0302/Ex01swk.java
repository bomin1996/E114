package algorithmEx.date0302;

public class Ex01swk {

	//url 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120883
	public static void main(String[] args) {

		String[] id_pw = {"programmer01", "15789"};

		String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

		
		
		String answer = "";

		for(int i=0;i<db.length;i++) {
			if(db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1]) ) {
				answer = "login";
				break;
			}else if(db[i][0].equals(id_pw[0])) {
				answer = "wrong pw";
				break;
			}else {
				answer = "fail";
			}
		}

		
	}
}