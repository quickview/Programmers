package 코테_연습.문자열_계산하기;

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");

		int result = Integer.parseInt(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if(arr[i].equals("+")){
				result += Integer.parseInt(arr[i+1]);
			}else if(arr[i].equals("-")){
				result -= Integer.parseInt(arr[i+1]);
			}
        }
           
        
        return result;
    }

	public static void main(String[] args) {
		Solution sol = new Solution();
		String input = "3 + 4 - 5";
		System.out.println(sol.solution(input));
	}
}