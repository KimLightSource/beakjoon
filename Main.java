import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        int three = 0;
        int five = 0;
        for (int i = a / 5; i >= 0; i--) {
            int b = a;
            b = b - (i*5);
            if(b % 3 == 0) {
                three = b / 3;
                five = i;
                break;
            }
        }
        if (three == 0 && five == 0) {
            System.out.println(-1);
        } else {
            System.out.println(three+five);
        }
        }
        }
