import java.util.Scanner;
// 소수 만들기
class Solution {
    public int solution(int[] nums){
        int answer=0;
        int num = 0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j< nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++){
                    num = nums[i]+nums[j]+nums[k];
                    System.out.println();
                    System.out.println("answer = " + answer);
                    System.out.println("i = " + i + " j = " + j + " k = "+ k );
                    System.out.println("num = " + num);
                    int isConstant = 1;
                    for(int op=2; op<=num-1; op++) {
                        if (num % op == 0) {
                            isConstant = 0;
                            break;
                        }
                    }
                    if(isConstant == 1)
                    {
                        answer++;
                    }

                }
            }
        }




        return answer;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        for(int i=0; i<num; i++){
           nums[i] = sc.nextInt();
        }

        System.out.println(solution.solution(nums));




    }

}






