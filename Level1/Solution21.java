// 서울에서 김서방 찾기
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for(int cnt=0; cnt< seoul.length; cnt++){
            if(seoul[cnt].equals("Kim")){
                answer += "김서방은 " +cnt+"에 있다";
            }
        }
        return answer;
    }
}