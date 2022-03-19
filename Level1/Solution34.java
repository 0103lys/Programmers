import java.util.HashMap;
// 완주하지 못한 선수
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap();
        for(int i=0; i< participant.length; i++){
            // hashMap에서 Key값(참여한 선수의 이름)이 이미 존재 할 경우
            if(hashMap.containsKey(participant[i])) {
                // hashMap value값 + 1
                hashMap.put(participant[i], hashMap.get(participant[i]) + 1);
            }else {
                hashMap.put(participant[i], 1);
            }
        }
        for(int i=0; i< completion.length; i++){
            // 완주자 이름을 hashMap에서 찾으면 value값 - 1
            hashMap.put(completion[i], hashMap.get(completion[i])-1);
        }

        for(int i=0; i<hashMap.size(); i++){
            // hashMap value가 1인 값 찾기
            if(hashMap.get(participant[i])==1){
                answer = participant[i];
            }
        }
        return answer;

    }
}