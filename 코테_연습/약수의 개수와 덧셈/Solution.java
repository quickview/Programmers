import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int left, int right) {

        ArrayList<Integer> list = new ArrayList<>();
        //1. 약수를 구한다.
        for (int i = left; i <= right; i++) {
            int count = 2;
            for(int j = 2; j < i){
                
            }
        }

        //2. 조건에 맞는 
        
        
        return 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int left = 13;
        int right = 17;
        System.out.println(sol.solution(left, right));
    }
}