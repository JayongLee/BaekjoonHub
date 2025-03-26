import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int a = 1; a < N-1; a++) {
                for (int b = a + 1; b < N; b++) {
                    if ((Math.pow(a, 2) + Math.pow(b, 2) + M) % (a*b) == 0) {
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}