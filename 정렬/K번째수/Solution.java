package 정렬.K번째수;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        // 1.1 주어진 배열에서 자르기
        int mother = 1;
        int startPoint = 1;
        int endPoint = 2;
        int targetPoint = 3;

        int [] result = new int[commands.length];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            list.add(array[i]);
            
            list.subList(commands[mother][startPoint], commands[mother][endPoint]);
            Collections.sort(list);
            
            mother++;
            
         
            result[i] = list.get(targetPoint);
            
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commadns = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(sol.solution(arr, commadns));
    }
}