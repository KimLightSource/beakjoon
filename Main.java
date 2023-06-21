import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.math.BigInteger;
import java.util.*;


class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] alpha= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num= {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int a= 0;
        for (String alp : alpha) {
            s = s.replaceAll(alp, num[a++]);
        }
         answer = Integer.parseInt(s);
        return answer;
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        s.solution( "one4seveneight");
    }
}
