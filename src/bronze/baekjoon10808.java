package bronze;

import java.util.Scanner;

public class baekjoon10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳 소문자로만 이루어진 단어 S
        String S = sc.nextLine();

        // 각 알파벳
        int[] arr = new int[26];
        // 단어에 몇 개가 포함되어 있는지
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a']++;
        }
        // 공백으로 구분해서 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
