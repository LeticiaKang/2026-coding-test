class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int top = numer1 * denom2 + numer2 * denom1;
        int bottom = denom2 * denom1;
        int gcd = getGCD(top, bottom);
        answer[0] = top / gcd;
        answer[1] = bottom / gcd;
        return answer;
    }
    
    //최대공약수 
    private int getGCD(int a, int b) {
        if(b == 0) {
            return a;
        }
        return getGCD(b, a%b);
    }
}