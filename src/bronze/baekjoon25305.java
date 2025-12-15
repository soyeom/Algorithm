package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 총 N명의 학생
        int N = sc.nextInt();
        // 상을 받는 K명의 학생
        int K = sc.nextInt();

        // 학생들의 점수
        int [] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }

        // 상을 받는 커트라인이 몇 점인지
        Arrays.sort(x);
        // 높은 점수가 뒤에 있으니까 N-K
        System.out.println(x[N-K]);
    }
}
