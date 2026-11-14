class Solution {
    public int solution(int number, int n, int m) {
        boolean tf = (number % n == 0) && (number % m == 0) ;
        int answer = tf ? 1 : 0;
        return answer;
    }
}