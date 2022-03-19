import java.util.ArrayList;
import java.util.Collections;
// 나누어 떨어지는 숫자 배열
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                arrayList.add(arr[i]);
            }
        }
        Collections.sort(arrayList);
        if(arrayList.size()==0){
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[arrayList.size()];
            for(int i=0; i< arrayList.size(); i++){
                answer[i] = arrayList.get(i);
            }
        }
        
        return answer;
    
    }
}