// 문자열 내 p와 y의 개수
class Solution {
    boolean solution(String s) {
        int i=0, j=0, cnt;
        String[] arr = s.split("");
        boolean answer = true;

        for(cnt=0; cnt<arr.length; cnt++){
            if(arr[cnt].equals("p")||arr[cnt].equals("P")){
                i++;
            }
            else if(arr[cnt].equals("y")||arr[cnt].equals("Y")){
                j++;
            }
        }
        if(i==j){
            return answer;
        }else {
            answer = false;
            return answer;

        }

    
    }
}