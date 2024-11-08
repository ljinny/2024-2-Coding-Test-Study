import java.util.Arrays;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[] answer1 = {1, 2, 3, 4, 5}; //학생별 정답 배열 생성
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int count = 0;
        for (int i=0; i<answers.length; i++){ //배열을 돌며 정답과 비교
            if (answers[i] == answer1[i % 5])
                sum1++; //맞으면 해당 학생의 점수 +1
            if (answers[i] == answer2[i % 8])
                sum2++;
            if (answers[i] == answer3[i % 10])
                sum3++;
        }
        int max = Math.max(sum1, Math.max(sum2, sum3)); //가장 높은 점수 찾기
        if (max == sum1){
            answer[count++] = 1; //최고 점수와 동일하면 학생 추가
        }
        if (max == sum2){
            answer[count++] = 2;
        }
        if (max == sum3){
            answer[count++] = 3;
        }
        answer = Arrays.copyOf(answer, count); //필요한 길이만큼 잘라줌

        return answer;
    }
}