package 코테_연습.배열유사성;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if(s1[i] == s2[j]) answer++;
			}
		}
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
		String[] s1 = {"a","b","c"};
		String[] s2 = {"com", "b", "d", "p", "c"};

        System.out.println(sol.solution(s1, s2));
    }
}
