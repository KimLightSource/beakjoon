import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double totalScore = 0;
        double totalCredit = 0;
        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credit = sc.nextDouble();
            String score = sc.next();
            if (score.equals("A+")) {
                totalScore = totalScore + (credit * 4.5);
                totalCredit = totalCredit+credit;
            }
            else if (score.equals("A0")) {totalScore = totalScore + (credit * 4.0); totalCredit = totalCredit+credit;}
            else if (score.equals("B+")) {totalScore = totalScore + (credit * 3.5); totalCredit = totalCredit+credit;}
            else if (score.equals("B0")) {totalScore = totalScore + (credit * 3.0); totalCredit = totalCredit+credit;}
            else if (score.equals("C+")) {totalScore = totalScore + (credit * 2.5); totalCredit = totalCredit+credit;}
            else if (score.equals("C0")) {totalScore = totalScore + (credit * 2.0); totalCredit = totalCredit+credit;}
            else if (score.equals("D+")) {totalScore = totalScore + (credit * 1.5); totalCredit = totalCredit+credit;}
            else if (score.equals("D0")) {totalScore = totalScore + (credit * 1.0); totalCredit = totalCredit+credit;}
            else if (score.equals("F")) {totalScore = totalScore + (credit * 0); totalCredit = totalCredit+credit;}
            else if (score.equals("P") ) totalScore = totalScore;
        }
        System.out.println(totalScore /totalCredit);


    }
}
