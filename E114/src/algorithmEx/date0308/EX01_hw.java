package algorithmEx.date0308;

public class EX01_hw {
	//문제 : https://school.programmers.co.kr/learn/courses/30/lessons/120863
	public static void main(String[] args) {
		String answer = "x + 3 + 5";
		String total = "";
		
		String[] arr = answer.split(" ");
		int x = 0;
		int y = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
            if(arr[i].contains("x")) {
            	if(arr[i].equals("x")) {
            		x += 1;
            	} else {
            		x += Integer.parseInt(arr[i].replace("x", ""));
            	}
            }else {
            	if(arr[i].matches("^[0-9]*$")) {
            		y += Integer.parseInt(arr[i]);
            	}
            }
        }
		total += x + "x";
		
        if(y>0){
        	if(total.equals("1x")) {
        		if(y>0) {
        			total = "x";
        			answer = total + " + " + y;
        		}else {
        			total = "x";
        			answer = total;
        		}
        		
        	}else if(total.equals("0x")) {
        		answer = Integer.toString(y);
        	}else {        		
        		answer = total + " + " +  y;
        	}
        }else{
        	if(total.equals("1x")) {
        		total = "x";
        	}
            answer = total;
        }
        System.out.println(answer);
		
	}

}
