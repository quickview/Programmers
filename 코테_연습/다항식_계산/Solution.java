package test;

import java.util.ArrayList;

class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        int xNum= 0;
        int normalNum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
            if(arr[i].contains("x")){
                arr[i] = arr[i].replaceAll("x", "");
                if(arr[i].equals("")){
                    xNum++;
                }else{
                    xNum += Integer.valueOf(arr[i]);
                }
            }else{
                normalNum += Integer.valueOf(arr[i]);
            }
        }

        String answer = "";
        if(normalNum == 0){
            if(xNum == 1){
                answer = "x";
            }else{
                answer = xNum +"x";
            }
        }else if(xNum == 0){
            answer = normalNum+"";
        }else{
            if(xNum == 1){
                answer = "x + "+ normalNum;
            }else{
                answer = xNum +"x + "+ normalNum;
            }
        }
        
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String poly = "x";
        System.out.println(sol.solution(poly));
    }
}

