class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean odd = (n % 2 == 1); 
        if(odd) {
            for(int x = n; x>0 ; x--){
                answer = answer + ((x%2==1) ? x : 0);
            }
        } else {
            for(int x = n; x>0 ; x--){
                answer = answer + ((x%2==0) ? (x*x) : 0);
            }
        }
        return answer;
    }
}