package bronze;

import java.util.Scanner;

public class baekjoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] S = sc.nextLine().split(" ");
        String P = "";

        // 각 문자를 R번 반복해야 함
        int R = Integer.parseInt(S[0]);

        for (int i = 0; i < S[1].length(); i++) {
            for (int j = 0; j < R; j++) {
                P += S[1].charAt(i);
            }
        }

        System.out.println(P);
    }
}
