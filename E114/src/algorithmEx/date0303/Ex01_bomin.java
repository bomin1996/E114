package algorithmEx.date0303;

public class Ex01_bomin {
	
	//url 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120884?language=java
	public int solution(int chicken) {
        int answer = 0;
        int coupon = 0;
        while(chicken >= 10) {
            coupon = chicken / 10;
            chicken = chicken % 10 + coupon;
            answer += coupon;
        }
        return answer;
    }

}



