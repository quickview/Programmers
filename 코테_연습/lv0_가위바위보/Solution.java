package 코테_연습.lv0_가위바위보;


class Solution {
    public String solution(String my_string) {

        String answer = "";
		
		String[] arr = my_string.split("");
		String[] resultArr = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("2")){
				resultArr[i] = "0";
			}else if(arr[i].equals("0")){
				resultArr[i] = "5";
			}else if(arr[i].equals("5")){
				resultArr[i] = "2";
			}
		}

		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}

		for (String string : resultArr) {
			answer += string;
		}
        return answer;
    }

	public static void main(String[] args) {
		Solution sol = new Solution();

		String input = "205";
		System.out.println(sol.solution(input));
	}
}