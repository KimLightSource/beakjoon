import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for (int a = 0; a < i; a++) {
            int b = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = 1; j <= b; j++) {
                if (b % j == 0) count ++;
            }
            if (count == 2 ) answer++;
        }

        System.out.println(answer);

    }


}
