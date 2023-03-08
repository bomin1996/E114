package algorithmEx.date0308;
import java.util.*; 
public class EX01_smc {
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120863
	public String solution(String polynomial) {
	        String answer = "";
	        String[] arr = polynomial.split(" \\+ "); 
	        int n1 =0; //계수
	        int n2 =0; //상수
	        
	        for(String s : arr) {
	            if(s.equals("x")) {  // x값을 가질때
	                n1 += 1; // 1더하기
	            } else if (s.contains("x")){ // X문자 포함일때
	                n1 += Integer.parseInt(s.substring(0, s.length()-1)); // 문자열을 숫자로 변환(문자열 자르기)
	            } else if (!s.equals("+")){ // X값을 가지지 않을때
	                n2 += Integer.parseInt(s); // 문자열을 숫자로 변환
	            }
	        }
	        
	        if(n1 !=0 && n2 ==0){
	            if(n1 == 1) {
	                answer = "x";
	            }else {
	                answer = n1 + "x";
	            }
	        }

	        if(n1 !=0 && n2 !=0){
	            if(n1 == 1) {
	                answer = "x" + " + " + n2;
	            }else {
	                answer = n1 + "x" + " + "+ n2 ;
	            }
	        }
	        
	        if(n1==0 && n2 !=0){
	            answer = String.valueOf(n2); // String 으로 변환
	        }
	        
	        return answer;
	        
	    }
	}	

