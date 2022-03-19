package Inflearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// 나누어 떨어지는 숫자 배열
public class Problem0112 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        ArrayList<Integer> arrayList = new ArrayList();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                arrayList.add(arr[i]);
                //System.out.println(arrayList);
            }
        }
        Collections.sort(arrayList);
        if(arrayList.size()==0){
            answer = new int[1];
            answer[0]=-1;
        }else {
            answer = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                answer[i] = arrayList.get(i);
            }
        }

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Problem0112 problem0112 = new Problem0112();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        int divisor = sc.nextInt();

        System.out.println(problem0112.solution(arr, divisor));
    }

}
