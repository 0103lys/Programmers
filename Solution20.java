class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.matches("\\d{4}") || s.matches("\\d{6}")){
            return answer;
    
        }else 
            answer = false;
        return answer;
        

    }
}