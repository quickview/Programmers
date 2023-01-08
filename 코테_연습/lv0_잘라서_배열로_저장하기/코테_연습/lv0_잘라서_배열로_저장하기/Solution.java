package 코테_연습.lv0_잘라서_배열로_저장하기;

class Solution {
	public String[] solution(String my_str, int n) {
		String[] answer = null;
        if(my_str.length()%n ==0){
			answer = new String[my_str.length()/n];
		}else{
			answer = new String[my_str.length()/n+1];
		}
		

		int gap = 0;
		for (int i = 0; i < my_str.length()/n+1; i++) {
			if(i < my_str.length()/n){
				answer[i] = my_str.substring(gap, gap+n);
			}else{
				answer[i] = my_str.substring(gap);
			}
			gap+=n;
		}

        return answer;
    }

	public static void main(String[] args) {
		Solution sol = new Solution();
		String input = "abcdef123";
		int n = 3;
		System.out.println(sol.solution(input,n));
	}
}