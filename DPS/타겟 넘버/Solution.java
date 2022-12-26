class Solution {
    static int[] numbers = {1,1,1};
    static int target = 1;
    int answer;

    public void dfs (int index, int sum){
        // 1,  탈출 조건
        if(index == numbers.length){
            if(sum == target)
                answer++;
            return;
        }
        // 2. 수행동작
        dfs(index +1, sum + numbers[index]);
        dfs(index +1, sum - numbers[index]);
    }


    public int solution(int[] numbers, int target) {
        answer = 0;
        // this.numbers = numbers;
        // this.target = target;
        
        dfs(0,0);
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
  
        System.out.println(sol.solution(numbers, target));

    }

}