// 제일 작은 수 제거하기
class Solution {
    public int[] solution(int[] arr) {
        int min=0;
        int index=0;

        if(arr.length==1) {
            int[] answer = new int[arr.length];
            answer[0] = -1;
            return answer;
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }
            int[] answer = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (i == min) continue;
                answer[index] = arr[i];
                index++;
            }
            return answer;         
        }
        
    }
}