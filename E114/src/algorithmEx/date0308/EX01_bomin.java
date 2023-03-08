package algorithmEx.date0308;

public class EX01_bomin {
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120863
	public String main(String polynomial) {
		
		int xNum = 0;
        int num = 0;
        for (String s : polynomial.split(" ")) {
            if (s.contains("x")){ // x가 있으면
                xNum += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            }
            else if (!s.equals("+")){
                num += Integer.parseInt(s);
            }
        }
        return (xNum != 0 ? xNum > 1 ? xNum + "x" : "x" : "")+(num != 0 ? (xNum != 0 ? " + " : "")+num : xNum == 0 ? "0" : "");
		

		/*
		String[] arrary = polynomial.split(" \\+ ");
        int xNum = 0;
        int num = 0;

        for (String s : arrary){
            if(s.contains("x")){
                //x의 계수가 한자리수가 아닐 수 있다.
                xNum += s.length() == 1? 1 : Integer.parseInt(s.replace("x",""));
            }else{
                num+=Integer.parseInt(s);
            }
        }
        StringBuilder answer = new StringBuilder();
        answer.append(xNum == 0 ? num : num == 0 ? xNum + "x" : xNum + "x" + " + " + num);
        answer = new StringBuilder(answer.toString().replace("1x", "x"));
        return answer.toString();
		*/
	}

}
