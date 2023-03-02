package algorithmEx.date0303;

public class Ex01_swk {
	
	//url 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120884?language=java
	public static void main(String[] args) {
		int chicken = 1999;
		
		int answer = 0;
        int coupon = chicken;
        
        while(coupon>=10) {           //쿠폰이 10개 이상일때 계속 반복
        int temp = 0;
        answer += coupon/10;          //쿠폰 10 개당 추가
        temp += coupon/10;            
        coupon = coupon%10 + temp;    
        }
        System.out.println(answer);
	}

}
