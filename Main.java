import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int a = 1; a <= i; a++) {
            if (i % a == 0) count++;
            if (count == j) {
                System.out.println(a);
                break;
            }
        }
        if (count < j) System.out.println(0);

    }


}
