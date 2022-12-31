package 코테_연습.lv0_점의_위치_구하기;

class Solution {
    public int solution(int[] dot) {
        int answer = 0;

		int x = dot[0];
		int y = dot[1];

		if(x > 0 && y > 0){
			answer = 1;
		}else if(x < 0 && y > 0){
			answer = 2;
		}else if(x < 0 && y < 0){
			answer = 3;
		}else if(x > 0 && y < 0){
			answer = 4;
		}



		
        return answer;
    }

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] dot = {-7,9};
		System.out.println(sol.solution(dot));
	}
}