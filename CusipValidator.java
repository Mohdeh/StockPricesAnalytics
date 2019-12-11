import java.util.*;
import java.io.*;
 
public class CusipValidator {
    private static Boolean isCusip(String str) {
        if (str.length() != 9) return false;
        int sum = 0;
        for (int i = 0; i <= 7; i++) {
            char c = str.charAt(i);
 
            int v;
            if (c >= '0' && c <= '9') {
                v = c - 48;
            } else if (c >= 'A' && c <= 'Z') {
                v = c - 64;  // lower case letters invalid
            } else if (c == '*') {
                v = 36;
            } else if (c == '@') {
                v = 37;
            } else if (c == '#') {
                v = 38;
            } else {
                return false;
            }
            if (i % 2 == 1) v *= 2;  // check if odd since using 0-based indexing
            sum += v / 10 + v % 10;
        }
        return str.charAt(8) - 48 == (10 - (sum % 10)) % 10;
    }
 
    public static void main(String[] args) {
        List<String> candidates = List.of(
                "037833100",
                "17275R102",
                "38259P508",
                "594918104",
                "68389X106",
                "68389X105"
        );
        for (String candidate : candidates) {
            System.out.printf("%s -> %s%n", candidate, isCusip(candidate) ? "correct" : "incorrect");
        }
    }
}
