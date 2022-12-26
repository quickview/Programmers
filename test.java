public class test {
    
    // 문자열에서 인접한 중복 문자를 제거하는 함수
    public static String removeDuplicates(String s)
    {
        // 기본 케이스
        if (s == null) {
            return null;
        }
 
        char[] chars = s.toCharArray();
        char prev = 0;
        int k = 0;
 
        for (char c: chars){
            if (prev != c){
                chars[k++] = c;
                prev = c;
            }
        }
 
        return new String(chars).substring(0, k);
    }
 
    public static void main(String[] args)
    {
        String s = "AAABBCDDDAA";
        System.out.println(removeDuplicates(s));
    }

}
