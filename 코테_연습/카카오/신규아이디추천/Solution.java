package 코테_연습.카카오.신규아이디추천;

import java.util.ArrayList;

class Solution {

    
   
   
    
    
    public String solution(String new_id) {
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();
        
        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String tempStr = "";
        tempStr = new_id;
        tempStr = new_id.replaceAll("[a-z]", "");
        tempStr = tempStr.replaceAll("[0-9]", "");
        tempStr = tempStr.replaceAll("-", "");
        tempStr = tempStr.replaceAll("_", "");
        tempStr = tempStr.replaceAll("\\.", "");
        
        // 사용 못하는 문자열이 담김 배열
        String[] notAllowArr = tempStr.split("");
        
        for (int i = 0; i < notAllowArr.length; i++) {
            for (int j = 0; j < new_id.length(); j++) {
                if(notAllowArr[i].equals("*") || notAllowArr[i].equals("^")|| notAllowArr[i].equals("+")){
                    notAllowArr[i] = "\\"+notAllowArr[i];
                }
                new_id = new_id.replaceAll(notAllowArr[i], "");
            }
        }
        
        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        char[] chars = new_id.toCharArray();
        char prev = 0;
        int k = 0;
 
        for (char c: chars){
            if (prev != c){
                chars[k++] = c;
                prev = c;
            }
        }
        String thirdId = new String(chars).substring(0, k);

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(thirdId.startsWith(".")){
            thirdId = thirdId.substring(1);
        }
        if(thirdId.endsWith(".")){
            thirdId = thirdId.substring(0,thirdId.length()-1);
        }
        
        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(thirdId.equals("")){
            thirdId = "a";
        }


        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(thirdId.length() >= 16){
            thirdId = thirdId.substring(0, 15);
            if(thirdId.endsWith(".")){
                thirdId = thirdId.substring(0,thirdId.length()-1);
            }
        }
        
        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        String lastStr = "";
        System.out.println(thirdId);
        if(thirdId.length() <=2 ){
            lastStr = thirdId.substring(thirdId.length()-1, thirdId.length());
            for (int i = 0; i <= 3-thirdId.length(); i++) {
                thirdId += lastStr;
            }
        }
        
        String answer = thirdId;
        return answer;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        // String id = "...!@BaT#*..y.abcdefghijklm";
        String id ="=.=";
        System.out.println(sol.solution(id));
    }
}