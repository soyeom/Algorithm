package bronze;

import java.util.Scanner;

public class baekjoon2577 {
    public static void main(String[] args) {
        // 세 개의 자연수 A, B, C
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // A*B*C를 계산한 결과..문자열로 바꿈, 하나하나 계산 위해서
        String mul = String.valueOf(A*B*C);

        // 0~9까지 각각의 숫자가 몇 번씩 쓰였는지
        // 자바에서는 int[]는 자동으로 0으로 초기화
        int [] num = new int[10];
        for (int i = 0; i < mul.length(); i++) {
            int index = mul.charAt(i) - '0';
            num[index]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
    }
}
