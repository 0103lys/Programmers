// 3진법 뒤집기
class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n, 3);


        StringBuffer sb = new StringBuffer(num);
        String str = sb.reverse().toString();

        answer = Integer.parseInt(str, 3);
        
        return answer;
    }
}