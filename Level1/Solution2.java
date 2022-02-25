// x만큼 간격이 있는 n개의 숫자
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
       
        for (int i=0 ; i<answer.length; i++) {
			answer[i] = num;
            num = num + x;
		}
       
        return answer;
    }
}
    