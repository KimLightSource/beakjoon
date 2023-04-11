import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        while (!s.equals(".")) {
            Stack<Character> stack = new Stack<>();
            String answer = "yes";
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push('(');
                } else if (c == '[') {
                    stack.push('[');
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        answer = "no";
                        break;
                    }
                    if (stack.pop() != '(') {answer = "no"; break;}
                }else if (c == ']') {
                    if (stack.isEmpty()) {
                        answer = "no";
                        break;
                    }
                    if (stack.pop() != '[') {answer = "no"; break;}
                }
            }
            if (!stack.isEmpty()) answer = "no";
            sb.append(answer).append("\n");
            s= br.readLine();
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}

