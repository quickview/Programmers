package 코테_연습.기사단원의_무기;

class Solution {
    public int solution(int number, int limit, int power) {
        
        // 약수의 개수를 담을 배열
        int[] diviCount = new int[number];

        
        for (int target = 1; target <= number; target++) {
            int temp = 1;
            for (int j = 0; j < target; j++) {
                if(target % temp == 0){
                    diviCount[target-1]++;
                }
                temp++;
            }    
        }
        
        for (int i = 0; i < diviCount.length; i++) {
            if(diviCount[i] > limit){
                diviCount[i] = power;
            }
        }

        int answer = 0;
        for (int i = 0; i < diviCount.length; i++) {
          answer += diviCount[i];
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int number = 10;
        int limit = 3;
        int power = 2;
       
        System.out.println( sol.solution(number, limit, power));
    }
}