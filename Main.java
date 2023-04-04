import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        int[] j = new int[i];
        for (int a = 0; a < i; a++) {
            j[a] = Integer.parseInt(br.readLine());
        }
        ArrayList<Integer> agbs = new ArrayList<>();
        for (int a = 0; a < j.length - 2; a++) {
            int b = j[a + 1] - j[a];
            int c = j[a + 2] - j[a + 1];
            while (c > 0) {
                int temp = b;
                b = c;
                c = temp%c;
            }
            agbs.add(b);
        }
        Integer agb = agbs.stream().min(Comparator.comparing(x -> x)).get();
        int answer = 0;
        int count = j[0];
        for (int a = 1; a < j.length; a++) {
            count = count + agb;
            if (count != j[a]) {
                answer++;
                a--;
            } else continue;

        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}

