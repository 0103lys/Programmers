import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> answer = new HashSet<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answer.add(numbers[i]+numbers[j]);

            }
        }
        

        int[] arr = new int[answer.size()];
        int index= 0;
        for(int num : answer) {
            arr[index] = num;
            index++;
        }
        
        Arrays.sort(arr);

 
        return arr;









    }
        
}