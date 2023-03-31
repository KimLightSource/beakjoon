import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        HashSet<Object> set = new HashSet<>();
        for (int a = 0; a < s.length(); a++) {
            for (int b = a + 1; b <= s.length(); b++) {
                set.add(s.substring(a, b));
            }
        }
        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}

