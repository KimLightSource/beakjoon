import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String word = bufferedReader.readLine();
        word = word.toUpperCase();
        int[] ints = new int[26];
        for (char c : word.toCharArray()) {
            ints[c - 65]++;
        }
        int count = 0;
        int answer = 0;
        for (int i = 0; i < 26; i++) {
            if (ints[i] > count) {
                count = ints[i];
                answer = i+65;
            } else if (ints[i] == count) {
                answer = 63;
            }
        }
        System.out.println((char) answer);
    }
}
