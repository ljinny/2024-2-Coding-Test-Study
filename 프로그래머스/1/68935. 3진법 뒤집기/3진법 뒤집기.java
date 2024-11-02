class Solution {
    public int solution(int n) {
        int answer = 0;
        String ternaryVal = Integer.toString(n,3);
         StringBuilder backVal = new StringBuilder();
        for (int j = ternaryVal.length() - 1; j >= 0; j--) {
            backVal.append(ternaryVal.charAt(j));
        }
        answer = Integer.parseInt(backVal.toString(),3);
        return answer;
    }
}