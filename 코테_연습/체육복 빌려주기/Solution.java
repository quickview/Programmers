import java.util.HashSet;

class Solution{
    public int solution(int n, int[] lost, int[] reserve){
        //1. set을 만든다.
        HashSet<Integer> resSet = new HashSet<>();
        HashSet<Integer> lostSet = new HashSet<>();

        for (int i : reserve) {
            resSet.add(i);
        }

        for (int i : lost) {
            if(resSet.contains(i)){
                resSet.remove(i);
            }else{
                lostSet.add(i);
            }
        }
        //2. 여분을 확인하여 앞,뒤 학생에게 빌려준다.
        for (int i : resSet) {
            if(lostSet.contains(i-1)){
                lostSet.remove(i-1);
            }else if(lostSet.contains(i+1)){
                lostSet.remove(i+1);
            }
        }

        //3. 전체 학생 수에서 lostSet에 남은 학생 수를 빼준다.
        int answer = n -lostSet.size();

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        
        System.out.println(sol.solution(5, lost, reserve));
    }
}