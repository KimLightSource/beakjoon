import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int a = 0; a < i; a++) {
            Stack<Character> stack = new Stack<>();
            char[] chars = br.readLine().toCharArray();
            String s = "YES";
            for (char c : chars) {
                if (c == '(') {
                    stack.push(c);
                }
                else if (c == ')' && stack.isEmpty()) {
                    s = "NO";
                    break;
                }
                else {
                    stack.pop();
                }
            }
            if (!stack.isEmpty()) {
                s = "NO";
            }
            sb.append(s).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}

