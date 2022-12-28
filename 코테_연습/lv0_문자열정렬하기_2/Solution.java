package 코테_연습.lv0_문자열정렬하기_2;

import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
		String answer = "";

		my_string = my_string.toLowerCase();

		char[] arr = new char[my_string.length()];
	
		for (int i = 0; i < my_string.length(); i++) {
			arr[i] = my_string.charAt(i);
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}

        return answer;
    }

	public static void main(String[] args) {
		Solution sol = new Solution();
		
		String input = "Python";
		
		System.out.println(sol.solution(input));
	}
}