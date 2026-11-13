class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int my_len = my_string.length();
        int ow_len = overwrite_string.length();
        answer  =  my_string.substring(0,s) + overwrite_string;
        if((my_len - s - ow_len)  > 0) {
            answer = answer + my_string.substring(ow_len+s);
        } 
        return answer;
    }
}