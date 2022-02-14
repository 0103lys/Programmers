class Solution {
    public StringBuilder solution(int n) {
        StringBuilder sb = new StringBuilder();


        for(int i=1; i<=num; i++){
            if(i%2!=0){
                sb.append("수");
            }else if(i%2==0){
                sb.append("박");
            }
        }

        return sb;


    }
}