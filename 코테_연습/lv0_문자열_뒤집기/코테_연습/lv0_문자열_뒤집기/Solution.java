package 코테_연습.lv0_문자열_뒤집기;

class Solution {
    public String solution(String my_string) {

        String answer = "";
		
		String[] arr = my_string.split("");
		for (int i = arr.length-1; i >= 0; i--) {
			answer+= arr[i];
		}

        return answer;
    }

	public static void main(String[] args) {
		Solution sol = new Solution();

		String input = "bread";
		System.out.println(sol.solution(input));
	}
}