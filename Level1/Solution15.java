class Solution {
    public int[] solution(int n, int m) {
        int result = gcd(n, m);
        int[] answer = {result, (n*m)/result};
        return answer;
    }
    
     public int gcd(int n, int m) {
        if(n%m ==0){
            return m;
        }
        return gcd(m, n%m);
    }
}