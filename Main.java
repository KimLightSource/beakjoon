import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        while (true) {
            String answer = "";
            int b = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            if (i == -1) break;
            answer = i+" = 1";
            for (int a = 2; a < i; a++) {
                if (i % a == 0) b = a + b;
            }
            if (i == b+1) {
                for (int a = 2; a < i; a++) {
                    if (i % a == 0) {answer = answer + " + " +a ; }
            }} else if (i != b+1) {
                answer = i + " is NOT perfect.";
            }
            System.out.println(answer);
        }


    }


}
