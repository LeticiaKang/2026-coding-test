import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        for (char ch : a.toCharArray()){
            if(Character.isLowerCase(ch)) {
                b = b + Character.toUpperCase(ch);
            } else {
                b = b + Character.toLowerCase(ch);
            }
        }
        System.out.print(b);
    }
}