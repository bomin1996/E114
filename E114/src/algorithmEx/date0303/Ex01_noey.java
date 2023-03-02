package algorithmEx.date0303;

public class Ex01_noey {
	
	//url 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120884?language=java
	public int solution(int chicken) {
		int coupon = chicken;
		int service = 0;
        while(coupon >= 10) {
        	service += coupon / 10;
        	coupon = coupon / 10 + (coupon % 10);
        }
        return service;
    }
}
