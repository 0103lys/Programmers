import java.util.*;

// 같은 숫자는 싫어
public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int tmp = -1;
        for(int i=0; i<arr.length; i++){
            if(tmp != arr[i]){
                tmp = arr[i];
                arrayList.add(arr[i]);
            }
        }
        answer = new int[arrayList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}