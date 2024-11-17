class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]); // OR 연산 후 2진수로 변환

            // 길이를 n으로 맞추기 위해 앞쪽에 0 채우기
            while (binary.length() < n) {
                binary = "0" + binary;
            }
      
            answer[i] = binary.replace("1", "#").replace("0", " "); // 1 -> #, 0 -> 공백 변환
        }
        return answer;
    }
}
