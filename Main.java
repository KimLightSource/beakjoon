import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        for (int a = 0; a < i; a++) {
            map1.put(s1[a], 0);
        }
        for (int a = 0; a < j; a++) {
            map2.put(s2[a], 0);
        }
        int answer = 0;
        for (int a = 0; a < i; a++) {
            if (!map2.containsKey(s1[a])) answer++;
        }
        for (int a = 0; a < j; a++) {
            if (!map1.containsKey(s2[a])) answer++;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}

