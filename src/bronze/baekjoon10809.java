package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳 소문자로만 이루어진 단어 S
        String s = sc.nextLine();

        // 알파벳 전체를 담고 있는 알파벳 인덱스 집합
        int[] arr = new int[26];
        // 전체를 -1로 채움
        Arrays.fill(arr, -1);

        // 문자열에서 문자 가져오기
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 해당 알파벳의 인덱스 번호가 c-'a'에 담겨 있다
            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(arr[i]);
        }
    }
}