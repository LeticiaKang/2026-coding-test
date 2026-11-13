class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(Character ch : num_str.toCharArray()) {
            answer = (int) ch - '0' + answer;
        }
        return answer;
    }
}