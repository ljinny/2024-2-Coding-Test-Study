public class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0; // cards1의 현재 위치
        int index2 = 0; // cards2의 현재 위치

        for (String word : goal) {
            if (index1 < cards1.length && word.equals(cards1[index1])) {
                index1++;
            }
            else if (index2 < cards2.length && word.equals(cards2[index2])) {
                index2++;
            }
            else {
                return "No";
            }
        }

        return "Yes";
    }

}
