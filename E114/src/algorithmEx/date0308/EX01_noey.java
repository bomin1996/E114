package algorithmEx.date0308;

public class EX01_noey {
	public String solution(String polynomial) {
        String answer = "";
        String[] split=polynomial.split("\\s\\+\\s");
        
        int rp = 0; //계수
        int tk = 0; //상수
        //x앞의 숫자가 있는 경우 - 숫자만 가져오기
        //x앞에 숫자가 없는 경우 - x의 개수 카운트
        //두개 더하기
        for(int i = 0; i < split.length; i++) {
        	if(split[i].matches("^[0-9]*$")) {
        		tk += Integer.parseInt(split[i]);
        	}else if(split[i].equals("x")) {
        		rp += 1;
        	}else if(split[i].contains("x")) {
        		rp += Integer.parseInt(split[i].substring(0, split[i].length()-1));
        	}
        }
        //리턴 해주기 -> 계수x + 상수
        if(rp!=0 && tk==0) { //상수가 0일 때
        	if(rp==1) answer = "x"; //계수가 1이면 그냥 x만 리턴
        	else answer = rp + "x"; //계수가 1이 아니면 계수를 붙임
        }
        if(rp==0 && tk!=0) { //계수는 없고 상수만 있음
        	answer = Integer.toString(tk);
        }
        if(rp!=0 && tk!=0) { //둘 다 있음
        	if(rp==1) answer = "x" + " + " + tk; //x의 계수가 1이면 x+상수
        	else answer = rp + "x" + " + " + tk; //x의 계수가 1이 아니면 계수x+상수
        }
        return answer;
    }
}
