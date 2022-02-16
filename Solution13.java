class Solution {
    public int[] solution(long n) {
        String[] num = Long.toString(n).split("");
        int[] answer = new int[num.length];
        for(int i=num.length-1; i>=0; i--){
            answer[(num.length-1)-i] = Integer.parseInt(num[i]);
        }
        
        return answer;
    }
}