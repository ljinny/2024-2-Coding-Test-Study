import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n>0){
            if (n%2 == 0) {
                n /= 2; //짝수이면 순간이동을 하는게 이득
            }
            else{
                n--; //홀수면 건전지를 사용해서 점프를 하는게 이득이므로
                ans++; //건전지 사용량 +1
            }      
        }
        return ans;
    }
}