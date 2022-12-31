package 코테_연습.lv0_중복된_숫자_개수;

class Solution {
	public int solution(int[] array, int n) {
		int answer = 0;

		for (int i = 0; i < array.length; i++) {
			if(array[i] == n){
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {1,1,2,3,4,5};
		int n = 1;
		System.out.println(sol.solution(arr, n));
	}
}