// 문자열 내림차순으로 배치하기
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(""); // 문자열 spilt
        
        // 문자열 배열 역순으로 정렬하기
        Arrays.sort(arr, Collections.reverseOrder());
        String answer = "";
        for(String string : arr){
            answer += string;
        }
        return answer;
    }

}