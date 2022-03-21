import java.util.ArrayList;
// 나머지가 1이 되는 수 찾기
class Solution {
    public int solution(int num) {
        int answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=1; i<num; i++){
            if(num%i==1){
                arrayList.add(i);
            }
        }
        answer = arrayList.get(0);
        return answer;

    }
    
}