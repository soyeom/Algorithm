package bronze;

import java.util.Scanner;

public class baekjoon1546 {
    public static void main(String[] args) {
        // 시험 본 과목의 개수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num = new int[n];

        // 현재 성적
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // 자기 점수 중에 최댓값을 골라 M이라고 하고, 모든 점수를 고침
        // 배열에서 최댓값을 찾을 때는 반복문 쓰는게 정석
        int max = num[0];

        for (int i = 0; i < n; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }

        // 새로운 평균 출력..
        double newAvg = 0;
        for (int i = 0; i < n; i++) {
            newAvg += (double) num[i] / max * 100;
        }

        System.out.println(newAvg/n);
    }
}
