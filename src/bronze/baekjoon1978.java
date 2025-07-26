package bronze;

import java.util.Scanner;

public class baekjoon1978 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 주어진 수 N개, 중에서 소수가 몇 개인지
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = Integer.parseInt(sc.nextLine());

        // 입력이 한 줄로 들어오는 경우는 nextInt 보다 이게 더 효율적
        String[] num = sc.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            if (isPrime(Integer.parseInt(num[i]))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
