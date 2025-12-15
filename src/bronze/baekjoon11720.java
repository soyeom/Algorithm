package bronze;

import java.util.Scanner;

public class baekjoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 숫자의 개수 N
        int N = Integer.parseInt(sc.nextLine());
        // 숫자 N개가 공백 없이
        String s = sc.nextLine();

        //공백 없이 들어온 문자열을 각각 숫자로
        int total =0 ;
        // 숫자를 모두 합해서 출력
        for (int i = 0; i < N; i++) {
            // charAt은 숫자가 아니라 문자
            total += s.charAt(i) - '0';
        }
        System.out.print(total);
    }
}
