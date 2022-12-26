package 코테_연습.가장큰수찾기;

class Solution {
    public int[] solution(int[] array) {

        int max = 0;
        int maxPos = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                maxPos = i;
            }
        }
        
        int[] answer = new int[2];
        answer[0] = max;
        answer[1] = maxPos;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,8,3};
        sol.solution(arr);
    }
}