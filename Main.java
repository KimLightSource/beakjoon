import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        for (int a = 1; a <= i; a++) {
            queue.offer(a);
        }
        while (queue.size() > 1) {
            queue.remove();
            Integer remove = queue.remove();
            queue.offer(remove);
        }
        sb.append(queue.remove());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }



}

