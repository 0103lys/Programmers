// 문자열 내 마음대로 정렬하기
class Solution {
    public String[] solution(String[] s, int n) {
        String[] answer = new String[s.length];
        String tmp = "";

        for(int i=0; i<s.length-1; i++){
           for(int j=i+1; j<s.length; j++){
               if(s[i].charAt(n)>s[j].charAt(n)){
                   tmp = s[i];
                   s[i] = s[j];
                   s[j] = tmp;
               }else if(s[i].charAt(n)==s[j].charAt(n)){
                   if(s[i].compareTo(s[j])>0){
                       tmp = s[i];
                       s[i] = s[j];
                       s[j] = tmp;
                   }
               }
           }
       }
       for(int i=0; i<s.length; i++){
           answer[i] = s[i];
       }
       return answer;
    }
}