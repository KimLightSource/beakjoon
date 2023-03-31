import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<Object> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        for (int a = 1; a <= i; a++) {
            String s = br.readLine();
            map.put(s, a);
            list.add(s);
        }
        for (int a = 1; a <= j; a++) {
            String s = br.readLine();
            if (map.containsKey(s)) sb.append(map.get(s)).append("\n");
            else {
                sb.append(list.get(Integer.parseInt(s)-1)).append("\n");}
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

