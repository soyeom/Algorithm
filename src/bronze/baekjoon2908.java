package bronze;

import java.util.Scanner;

public class baekjoon2908 {
    public static void main(String[] args) {
        // 같지 않은 세자리 수 두 개
        Scanner sc = new Scanner(System.in);

        // 0이 포함되어 있지 않다
        String A = sc.next();
        String B = sc.next();

        // 거꾸로 읽었을 때 크기가 큰 수는?
        // 문자열을 거꾸로 읽어
        int ra = Integer.parseInt(new StringBuilder(A).reverse().toString());
        int rb = Integer.parseInt(new StringBuilder(B).reverse().toString());

        System.out.println(Math.max(ra, rb));
    }
}
