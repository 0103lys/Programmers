class Solution {
    public boolean solution(int x) {
        int num = x;
        String numStr = String.valueOf(num);
        boolean answer = true;
        int result = 0;
        
        for(int i=0; i<numStr.length(); i++){
            result += Integer.parseInt(numStr.substring(i,i+1));
        }
        if(x%result==0){
            return answer;
        }
        else{
            answer = false;
            return answer;
        }
    }
}
