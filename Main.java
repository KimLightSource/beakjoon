import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] sa = new char[5][15];
        int max = 0;
        for (int i = 0; i < sa.length; i++) {
            String s = br.readLine();
            if(max<s.length()) max = s.length();

            for (int j = 0; j < s.length(); j++) {
                sa[i][j] = s.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(sa[j][i] == '\0') continue;
                sb.append(sa[j][i]);
            }
        }
        System.out.println(sb);
        }


    }
