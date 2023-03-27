import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String answer = "";
        while (a != b) {
            if (b % a == 0) answer = "factor";
            else if (a % b == 0) answer = "multiple";
            else answer = "neither";
            System.out.println(answer);
            a = sc.nextInt();
            b = sc.nextInt();

        }


    }


    }
