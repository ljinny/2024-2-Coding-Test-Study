class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ",-1);
        String[][] chars = new String[str.length][];
        for(int i=0; i<str.length; i++){
            chars[i] = str[i].split("");
            for (int j=0; j<chars[i].length; j++){
                chars[i][j] = chars[i][j].toLowerCase();
                if(j%2==0){
                    chars[i][j] = chars[i][j].toUpperCase();
                }
            }
            str[i] = String.join("", chars[i]);
        }
        answer = String.join(" ", str);
        return answer;
    }
}