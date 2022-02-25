// K번째수
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i,j,k;
        
        for(int cnt=0; cnt<commands.length; cnt++){
            i = commands[cnt][0];
            j = commands[cnt][1];
            k = commands[cnt][2];
            ArrayList<Integer> arrayList = new ArrayList();
            for(int a=i-1; a<j; a++){
                arrayList.add(array[a]);
            }
            Collections.sort(arrayList);
            
            answer[cnt] = arrayList.get(k-1);
            
        }
        
        return answer;
    }
}