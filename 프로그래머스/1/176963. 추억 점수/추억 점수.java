import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> yearningVal = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningVal.put(name[i], yearning[i]);
        }

        int[] result = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String person : photo[i]) {
                score += yearningVal.getOrDefault(person, 0);
            }
            result[i] = score;
        }

        return result;
    }
}
