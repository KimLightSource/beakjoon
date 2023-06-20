import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 0; i < Integer.parseInt(s); i++) {
            String s1 = br.readLine();
            BigInteger num = new BigInteger(s1);
            while (!num.isProbablePrime(10)){
                num = num.add(BigInteger.valueOf(1));
            }
            System.out.println(num);
        }
    }

}
