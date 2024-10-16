class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] num = new int[k+1];
        for (int i=0; i<score.length; i++){
            num[score[i]]++;
        }
        for (int i=k; i>0; i--){
            if (num[i] < m){
                num[i-1] += num[i];
            }
            else{
                answer += i * m * (num[i] / m);
                num[i-1] += num[i] %= m;
            }
        }
        
        return answer;
    }
}