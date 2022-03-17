// 짝수와 홀수
class Solution {
    public String solution(int num) {
        String answer = "Even";
        if(num%2==0){
            return answer;
        }
        else{
            answer = "Odd";
            return answer;
        }
        
       
    }
}