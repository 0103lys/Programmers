// 약수의 개수와 덧셈
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int ln = left;
        int rn = right;
        
        while(ln<=rn){
            int cnt = 0;
            for(int i=1; i<=ln; i++){
                if(ln%i==0) {
                    cnt++;
                }
            }if(cnt%2==0){
                answer += ln;
            }else
            {
                answer -= ln;
            }
            ln++;
        }
        



        return answer;
    
    }
}