import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        String temp;
        long answer;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(Long.valueOf(arr[i]) < Long.valueOf(arr[j])){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        StringBuilder str = new StringBuilder();
        for (String aList : arr) str.append(aList);

        return Long.parseLong(str.toString());
    }
}