// LongestUniqueSubstring.java

import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring {

    public static int longestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.println("Longest unique substring length: " + longestSubstring(s));
        sc.close();
    }
}
