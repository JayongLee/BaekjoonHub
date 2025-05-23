import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() > 0) {
            if (queue.size() == 1) {
                System.out.println(queue.poll());
                return;
            }
            queue.poll();
            queue.add(queue.poll());
        }
    }
}