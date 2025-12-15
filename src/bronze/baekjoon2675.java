package bronze;

import java.util.Scanner;

public class baekjoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 여기 parseInt 하는게 좋나..? 그냥 nextInt() 하면 안되는 이유
        int T = Integer.parseInt(sc.nextLine());

        // 테스트 케이스만큼 반복
        for (int i = 0; i < T; i++) {
            StringBuilder P= new StringBuilder();
            String[] S = sc.nextLine().split(" ");

            // 각 문자를 R번 반복해야 함
            int R = Integer.parseInt(S[0]);

            for (int j = 0; j < S[1].length(); j++) {
                for (int k = 0; k < R; k++) {
                    P.append(S[1].charAt(j));
                }
            }
            System.out.println(P);
        }
    }
}
