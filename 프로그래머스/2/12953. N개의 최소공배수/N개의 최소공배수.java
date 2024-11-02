class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
 
    public int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }

    public int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }
}