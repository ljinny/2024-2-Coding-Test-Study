import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (char word : s.toCharArray()) {
            if (stack.size() > 0 && word == stack.peek()) { 
                // 방금 들어온 문자랑 같으면 짝을 이루므로 pop
                stack.pop(); 
            } else {
                // 아니라면 스택에 추가
                stack.push(word); 
            }
        }

        return stack.size() == 0 ? 1 : 0; // 다 제거되었으면 1 반환
    }
}