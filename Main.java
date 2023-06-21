import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int sqrt = (int) Math.sqrt(i);
            int count = 0;
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    count++;
                    if (i / j != j) {
                        count++;
                    }
                }
            }
            if (count > limit) answer = answer + power;
            else answer = answer + count;
        }
        return answer;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        s.solution();
    }
}
