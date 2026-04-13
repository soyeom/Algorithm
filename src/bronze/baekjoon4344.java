package bronze;

import java.util.Scanner;

public class baekjoon4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수
        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {
            // 각 테스트 케이스마다 학생의 수 N이 첫 수
            int N = sc.nextInt();
            // 평균
            int avg = 0;

            // N명의 점수
            for (int j = 0; j < N; j++) {
                // 점수 배열
                int [] scores = new int[N];

                scores[j] = sc.nextInt();

                // 평균
                avg += scores[j] / N;

                int student = 0 ;
                for (int k = 0; k < N; k++) {
                    // 평균 넘은 학생들의 비율을 반올림하여 소수 셋째 자리까지 출력
                    if (scores[k] > avg) {
                        student++;
                    }
                }

                System.out.println(student/N);
            }
        }

        // 정답과 출력값의 상대 오차는 10^-3 이하이면 정답


    }
}
