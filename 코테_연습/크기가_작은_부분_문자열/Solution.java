package 코테_연습.크기가_작은_부분_문자열;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() +1; i++) {
            if(Long.parseLong(t.substring(i, i+p.length())) <= Long.parseLong(p)){
                answer++;
            }
        }
               
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String t = "500220839878"	;
        String p = "7";
        System.out.println(sol.solution(t, p));

    }

}