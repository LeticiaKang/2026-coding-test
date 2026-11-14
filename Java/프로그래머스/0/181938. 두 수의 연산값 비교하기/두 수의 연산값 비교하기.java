class Solution {
    public int solution(int a, int b) {
        int ans1 = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        int ans2 = 2 * a * b;
        return ans1 >= ans2 ? ans1 : ans2;
    }
}