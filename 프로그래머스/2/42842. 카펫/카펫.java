class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        int[] answer = new int[2];
        
        for (int h = 3; h <= Math.sqrt(area); h++) {
            if (area % h == 0) {
                int w = area / h;
                
                if ((w - 2) * (h - 2) == yellow) {
                    answer[0] = w;
                    answer[1] = h;
                    return answer;
                }
            }
        }
        return answer;
    }
}
