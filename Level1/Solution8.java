class Solution {
    public String solution(String s) {
        String answer = "";
        String[] result = s.split(""); // 공백을 기준으로 나누기
        int index = 0;
        StringBuffer word = new StringBuffer();
        
        
         for (int i = 0; i < result.length; i++) {
            if (result[i].equals(" ")) {	// 공백일 때 index를 0으로 되돌리기
                index = 0;
            } else if (index % 2 == 0) {	// 짝수번째일 때 대문자로 바꾸기
                result[i] = result[i].toUpperCase();
                index++;
            } else if (index % 2 != 0) {	// 홀수번째일 때 소문자로 바꾸기
                result[i] = result[i].toLowerCase();
                index++;
            }
            word.append(result[i]);
            
            
        }
        answer = word.toString();
        return answer;
      
        
    }
}
