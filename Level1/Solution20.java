// 문자열 다루기 기본
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        // 정규식 4자리 혹은 6자리인 숫자로만 구성되어있을 때 -> true
        if(s.matches("\\d{4}") || s.matches("\\d{6}")){
            return answer;
    
        }else 
            answer = false;
        return answer;
        

    }
}