import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int min = 0;
        int sum= 0;
        for (int i = b; i >= a; i--) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count ++;
            }
            if (count == 2) {
                sum = sum + i;
                min = i;
            }
        }
        if (sum != 0) {
            System.out.println(sum);
            System.out.println(min);
        } else if (sum == 0) {
            System.out.println(-1);
        }
    }


}
